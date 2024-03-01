package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // controller 선언
public class FirstController {
    @GetMapping("/hi") // URL 요청 접수
    public String niceToMeetYou(Model model) { // model 객체 받아 오기
        model.addAttribute("username", "홍팍"); // 모델 변수 등록
        return "greetings"; // greetings.mustache 파일 반환 (뷰 템플릿 페이지)
    }

    @GetMapping("/bye") // URL 요청 접수
    public String seeYouNext(Model model) { // 메서드 작성 , 모델 변수 받아 오기
        model.addAttribute("nickname", "홍길동"); // 모델 변수 등록하기
        return "Goodbye"; // goodbye.mustache 반환
    }
}
