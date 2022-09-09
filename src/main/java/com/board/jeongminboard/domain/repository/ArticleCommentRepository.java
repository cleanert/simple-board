package com.board.jeongminboard.domain.repository;

import com.board.jeongminboard.domain.entity.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
