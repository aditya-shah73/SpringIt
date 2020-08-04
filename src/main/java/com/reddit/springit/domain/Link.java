package com.reddit.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Link {

    @Id //Marks a primary key
    @GeneratedValue //Auto incremental value
    private Long id;
    private String title;
    private String url;

}
