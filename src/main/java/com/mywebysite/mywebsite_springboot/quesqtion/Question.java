package com.mywebysite.mywebsite_springboot.quesqtion;

import com.mywebysite.mywebsite_springboot.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // 질문 하나에는 여러개의 답변이 작성 될수 이 ㅆ다. 이때 질문을 삭제하면 그에 달린 답변들도 모두 삭제하게 위함.
    private List<Answer> answerList;

}
