package com.mywebysite.mywebsite_springboot.quesqtion;

import com.mywebysite.mywebsite_springboot.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@Service
@RequiredArgsConstructor // final이 붙은 속성을 포함하는 생성자를 자동으로 생성하는 역할
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getList() { // 질문 목록 조ㅔ
        return this.questionRepository.findAll();
    }

    public Question getQuestion(Integer id) {
        Optional<Question> question = this.questionRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        } else throw new DataNotFoundException("question not found");
    }
}
