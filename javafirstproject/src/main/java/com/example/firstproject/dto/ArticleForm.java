package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 생성자 전체 삭제 후 새 어노테이션 추가로 대체
@ToString // toString 메서드 대체
public class ArticleForm {
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드
    
    public Article toEntity() {
        return new Article(null, title, content);
    }
}
