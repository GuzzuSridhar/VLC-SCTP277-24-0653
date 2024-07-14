package com.example.jpaform;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    /* Root end point */
    @RequestMapping("/")
    public String showMain() {
        return "index";
    }

    /* End point to add student records */
    @RequestMapping("/add")
    public String addStudent() {
        return "addstudent";
    }

    /* End point for saving the student record */
    @RequestMapping("/save")
    public String saveRecord(
            @RequestParam("sid") int sid,
            @RequestParam("sname") String sname,
            @RequestParam("sgrade") int sgrade,
            @RequestParam("smajor") String smajor,
            @RequestParam("smarks") float smarks) {
        Students newStudent = new Students(sid, sname, sgrade, smajor, smarks);
        studentRepo.save(newStudent);
        return "redirect:/list";
    }

    /* End point for listing the student records */
    @RequestMapping("/list")
    public String showStudents(Model model) {
        List<Students> studentsList = studentRepo.findAll();
        model.addAttribute("students", studentsList);
        return "viewstudents";
    }

    /* End Point for the search */
    @RequestMapping("/search")
    public String search(@RequestParam("kw") String keyWord, Model model) {
        List<Students> studentsList = studentRepo.search(keyWord);
        model.addAttribute("students", studentsList);
        return "viewstudents";
    }

    /* End point for editing a student record */
    @RequestMapping("/edit/{sid}")
    public String editStudent(@PathVariable("sid") int sid, Model model) {
        Optional<Students> student = studentRepo.findById(sid);
        model.addAttribute("student", student.get());
        return "editrecord";
    }

    /* End Point for Deleting a student record */
    @RequestMapping("/delete/{sid}")
    public String removeStudent(@PathVariable("sid") int sid) {
        studentRepo.deleteById(sid);
        return "redirect:/list";
    }

}
