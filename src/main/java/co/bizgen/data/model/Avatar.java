package co.bizgen.data.model;

public class Avatar {
private long id;
private String description;
private String image;
public Avatar(long id, String description, String image) {
	this.id = id;
	this.description = description;
	this.image = image;
}
public long getId() {
	return id;
}
public void setId(Long id2) {
	this.id = id2;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}

}
