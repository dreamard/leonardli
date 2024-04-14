package com.demo.controller;
import com.demo.entity.lily;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

@RestController()
@RequestMapping("/json")
public class HomeController {
    @RequestMapping("/user")
    public lily getlily()
    {
        return  new lily(1,"go","123456");
    }

   /* @RequestMapping("toTest")
    public ModelAndView toTest(){
        ModelAndView mv = new ModelAndView();
        //视图名
        mv.setViewName("lily");
        //想传的数据
        mv.addObject("o1","数据1");
        return mv;}*/

}
