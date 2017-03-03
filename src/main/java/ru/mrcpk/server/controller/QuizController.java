package ru.mrcpk.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.mrcpk.server.model.Question;
import ru.mrcpk.server.model.Quiz;
import ru.mrcpk.server.repository.QuestionDAOInterface;

@Controller
public class QuizController {

    @Qualifier("questions")
    @Autowired
    private QuestionDAOInterface questionDAOInterface;

    @RequestMapping("/quizJSP")
    public ModelAndView main(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("quizJSP",new Quiz(1,"JavaTest"));
        modelAndView.setViewName("first");
        return modelAndView;
    }

    @RequestMapping("/q/{id}/{questionText}")
    public String showQuiz(@PathVariable("id") int id, @PathVariable("questionText") String text, ModelMap modelMap){
        modelMap.addAttribute("question", questionDAOInterface.getQuestionById(id));
        return "question";
    }

    @RequestMapping(value = "/text", method = RequestMethod.GET)
    @ResponseBody
    public String getText(){
        return "Controller return text";
    }

}
