package com.reddit.springit.repository;

import com.reddit.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentReporsitory extends JpaRepository<Comment, Long> {
}
