package co.bizgen.data.model;

import java.util.ArrayList;
import java.util.List;



/**
 * Represents the Customer data
 * 
 * @author Oskar Compains
 *
 */
public class User {
	private Long id;
	private String username;
	private String password;
	private String email;
	private List<Idea> ideas = new ArrayList<Idea>();
	/**
	 * Default constructor
	 */
	public User() {

	}

	/**
	 * Constructor with all attributes
	 * 
	 * @param id
	 * @param name
	 * @param address
	 * @param email
	 */
	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the address
	 */
	public String getPassword() {
		return password;
		}
	

	/**
	 * @param address
	 *            the address to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Idea> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}
	public void addIdea(Idea idea) {
		this.ideas.add(idea);
	}
	
}
