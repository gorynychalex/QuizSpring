package ru.mrcpk.server.repository;

import org.springframework.stereotype.Repository;
import ru.mrcpk.server.model.Question;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDAO implements QuestionDAOInterface{

    @Override
    public Question getQuestionById(Number id) {
        return new Question(id,"Quest01");
    }

    @Override
    public List<Question> listQuestion() {

        List<Question> list = new ArrayList<>();

        list.add(new Question(0,"Quest01"));
        list.add(new Question(1,"Quest02"));
        list.add(new Question(2,"Quest03"));

        return list;
    }

    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public void removeQuestion(Number id) {

    }

    @Override
    public void updateQuestion(Question question) {

    }
}