package com.reddit.springit.repository;

import com.reddit.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Long > {

}