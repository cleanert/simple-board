package com.board.jeongminboard.domain.repository;

import com.board.jeongminboard.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
