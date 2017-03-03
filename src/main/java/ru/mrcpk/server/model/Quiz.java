package ru.mrcpk.server.model;

import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.util.List;


public class Quiz {
    private int id=1;
    private String name="Java";
//    private List<Question> questionList;
//    private DataSource dataSource;

    public Quiz(){}

    public Quiz(int id, String name) {
        this.id = id;
        this.name = name;
//        this.questionList = questionList;
    }

//    public DataSource getDataSource() {
//        return dataSource;
//    }
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<Question> getQuestionList() {
//        return questionList;
//    }
//
//    public void setQuestionList(List<Question> questionList) {
//        this.questionList = questionList;
//    }

}
