package com.mywebysite.mywebsite_springboot;

import com.mywebysite.mywebsite_springboot.answer.Answer;
import com.mywebysite.mywebsite_springboot.answer.AnswerRepository;
import com.mywebysite.mywebsite_springboot.quesqtion.QuestionRepository;
import com.mywebysite.mywebsite_springboot.quesqtion.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MywebsiteSpringbootApplicationTests {
    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다: [%03d]", i);
            String content = "내용 무";
            this.questionService.create(subject, content);
        }
    }
}
