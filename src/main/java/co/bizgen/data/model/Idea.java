package co.bizgen.data.model;

import java.util.Date;

public class Idea {
private long id;
private String name;
private String description;
private Date idea_date;
private float latitude;
private float longitude;
private User user;
public Idea(long id, String name, String description, Date idea_date, float latitude, float longitude, User user) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.idea_date = idea_date;
	this.latitude = latitude;
	this.longitude = longitude;
	this.user = user;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getIdea_date() {
	return idea_date;
}
public void setIdea_date(Date idea_date) {
	this.idea_date = idea_date;
}
public float getLatitude() {
	return latitude;
}
public void setLatitude(float latitude) {
	this.latitude = latitude;
}
public float getLongitude() {
	return longitude;
}
public void setLongitude(float longitude) {
	this.longitude = longitude;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
