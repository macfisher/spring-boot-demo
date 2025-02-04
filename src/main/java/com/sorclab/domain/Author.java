package com.sorclab.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author
{
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "author")
    private List<Post> posts;

    private Author() {}
    private Author(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Long getId() { return id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public List<Post> getPosts() { return posts; }
    public void setPosts(List<Post> posts) { this.posts = posts; }

    @Override
    public String toString() {
        return "Author [firstname=" +firstName + ", lastname=" + lastName + "]";
    }
}
