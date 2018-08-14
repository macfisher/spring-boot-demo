package com.sorclab.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post
{
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String body;
    private Date postedOn;

    @ManyToOne
    private Author author;

    private Post() {} // needed by JPA
    public Post(String title) { setTitle(title); }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public Date getPostedOn() { return postedOn; }
    public void setPostedOn(Date postedOn) { this.postedOn = postedOn; }

    @Override
    public String toString() { return "Post [title=" + title + "]"; }
}
