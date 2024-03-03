package com.example.firstproject.Interface;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;
// CrudRepository 패키지 자동 임포트

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
