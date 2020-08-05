package com.reddit.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@ToString
public class Link extends Auditable {

    @Id //Marks a primary key
    @GeneratedValue //Auto incremental value
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    //comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();

    public Link(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public Link() {

    }

    public void addComment(Comment comment){
        comments.add(comment);
    }
}