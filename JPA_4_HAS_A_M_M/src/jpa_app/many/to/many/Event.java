package jpa_app.many.to.many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.*;

@Entity
@Table(name="events_m_m")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eventId;
	private String eventName;

	@ManyToMany(mappedBy = "eventList")
	private List<Delegate> delegates = new ArrayList<>();

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public List<Delegate> getDelegates() {
		return delegates;
	}

	public void setDelegates(List<Delegate> delegates) {
		this.delegates = delegates;
	}
}
