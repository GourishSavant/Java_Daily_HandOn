package jpa_app.many.to.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="delegates_m_m")
public class Delegate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int delegateId;
	private String delegateName;
	
	@ManyToMany
	@JoinTable(name="Delegate_Events", 
	joinColumns={@JoinColumn(name="delegate_id")},
	inverseJoinColumns={@JoinColumn(name="event_id")})
	private List<Event> eventList= new ArrayList<>();

	public int getDelegateId() {
		return delegateId;
	}
	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}
	public String getDelegateName() {
		return delegateName;
	}
	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}
	public List<Event> getEventList() {
		return eventList;
	}
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
}
