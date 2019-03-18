package com.ttn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/stud")
public class StudentController  extends MultiController {
    @RequestMapping("/test")
    @ResponseBody
    protected ModelAndView test(StudentCO studentCO) throws Exception {
        ModelAndView modelAndView = new ModelAndView("Hello");
        modelAndView.addObject("msg",studentCO);
        return modelAndView;
    }

    @RequestMapping("/test1")
    @ResponseBody
    protected ModelAndView modelAttribute(@ModelAttribute("studentCO") StudentCO studentCO) throws Exception {
        ModelAndView modelAndView = new ModelAndView("Hello");
        return modelAndView;
    }

}