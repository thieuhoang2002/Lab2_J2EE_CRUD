package model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class User {
    protected int id;
    protected String name;
    protected String email;
    protected String country;
	private String description;
	private String picture;

    public User() {}

    public User(String name, String email, String country, String description, String picture) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
        this.description = description;
        this.picture = picture;
    }

    public User(int id, String name, String email, String country, String description, String picture) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.description = description;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}