package com.reddit.springit.repository;

import com.reddit.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long > {

//    Link findByTitle(String title);
//
//    List<Link> findAllByTitleLikeOrderByCreationDateDesc(String title);
}