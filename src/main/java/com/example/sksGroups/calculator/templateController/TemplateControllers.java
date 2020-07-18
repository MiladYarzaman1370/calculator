package com.example.sksGroups.calculator.templateController;

import com.example.sksGroups.calculator.Models.MyMath;
import com.example.sksGroups.calculator.services.MathServics;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
public class TemplateControllers {
    MathServics mathServics=new MathServics();
    @RequestMapping("/")
    public String home(Model model){
        MyMath myMath=new MyMath();
        model.addAttribute("inputData",myMath);

        return "index";
    }
    @RequestMapping("/sum")
    public String sum(@ModelAttribute("inpout")MyMath myMath){
        mathServics.sum(myMath);
        return "index";
    }
    @RequestMapping("/division")
    public String Division(@ModelAttribute("inpout")MyMath myMath){
         mathServics.Division(myMath);
        return "index";
    }
    @RequestMapping("/submission")
    public String Submission(@ModelAttribute("inpout")MyMath myMath){
          mathServics.Submission(myMath);
        return "index";
    }
    @RequestMapping("/Multiplication")
    public String Multiplication(@ModelAttribute("inpout")MyMath myMath){
            mathServics.Multiplication(myMath);
        return "index";
    }

}
