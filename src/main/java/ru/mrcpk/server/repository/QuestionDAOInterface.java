package ru.mrcpk.server.repository;

import ru.mrcpk.server.model.Question;

import java.util.List;

public interface QuestionDAOInterface {
    public void addQuestion(Question question);
    public void updateQuestion(Question question);
    public void removeQuestion(Number id);
    public Question getQuestionById(Number id);
    public List<Question> listQuestion();
}
