package com.ttn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Anno")
public class ControllerAnno {
    @RequestMapping("/test")
    @ResponseBody
    String index(){
        return "index string";
    }
    @RequestMapping("/test1")
    ModelAndView index1(){
        ModelAndView modelAndView=new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping("/submit/{id}" )
    ModelAndView submit(@PathVariable("id") int id, @RequestParam("txt") String txt){
        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("msg",txt);
        modelAndView.addObject("company",id);
        return modelAndView;
    }
}
