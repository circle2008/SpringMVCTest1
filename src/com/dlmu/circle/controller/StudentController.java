package com.dlmu.circle.controller;

import com.dlmu.circle.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cf on 2017/5/24.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    private static List<Student> studentList=new ArrayList<Student>();
    static {
        studentList.add(new Student(1,"张三",13));
        studentList.add(new Student(2,"张三",16));
        studentList.add(new Student(3,"张三",18));

    }
    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("/student/list");
        return modelAndView;
    }
    @RequestMapping("/preSave")
    public ModelAndView preSave(@RequestParam(value = "id",required = false) String id){
        ModelAndView modelAndView=new ModelAndView();
        if(id!=null){
            modelAndView.addObject("student",studentList.get(Integer.parseInt(id)-1));
            modelAndView.setViewName("/student/update");
        }else {
            modelAndView.setViewName("/student/add");
        }

        return modelAndView;
    }
    @RequestMapping("/save")
    public String save(Student student){
        if(student.getId()!=0){
            Student s=studentList.get(student.getId()-1);
            s.setName(student.getName());
            s.setAge(student.getAge());
        }else {
            studentList.add(student);
        }
        return "redirect:/student/list.do";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id") int id){
        studentList.remove(id-1);
        return "redirect:/student/list.do";
    }
}
