package com.example.firstproject.Interface;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;
// CrudRepository 패키지 자동 임포트
import java.util.ArrayList;


public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll(); // Iterable -> ArrayList 수정
}
