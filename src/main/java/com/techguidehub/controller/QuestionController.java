package com.techguidehub.controller;

import com.techguidehub.model.Question;
import com.techguidehub.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {
     
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    @PutMapping("/{id}")
    public Question updateQuestion(@PathVariable Long id, @RequestBody Question question) {
        question.setQuestionId(id);
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }


}
