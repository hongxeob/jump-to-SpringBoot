package com.mywebysite.mywebsite_springboot.quesqtion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
    Question findBySubject(String subjcet);
    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);

}
