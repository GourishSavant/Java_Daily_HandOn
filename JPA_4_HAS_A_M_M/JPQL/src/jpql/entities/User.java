package jpql.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "UserEntity")
@Table(name = "users")
//@NamedQueries(
//	{@NamedQuery(name = "findUsers", query = "from UserEntity"),
//	@NamedQuery(name = "findUsersByAge", query = "from UserEntity u where u.age = :userAge")})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long userId;
	
	private String name;
	private int age;
	
	// Default Constructor
	public User() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Getter and setter methods
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
