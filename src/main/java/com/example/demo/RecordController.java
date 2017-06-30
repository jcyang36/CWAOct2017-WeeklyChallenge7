package com.example.demo;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by student on 6/23/17.
 */
@Controller
public class RecordController {




        @Autowired
        private RecordRepository recordRepository;

        @RequestMapping("/")
        public String home( Model model) {

            model.addAttribute(new Record());
            return "index";
        }


        @RequestMapping(value = "/userlist")
        public String goUserList(@ModelAttribute Record record, Model model) {


            Iterable<Record> recordList = this.recordRepository.findAllByFirst("Bob");
            model.addAttribute("recordList", recordList);


            return "userlist";
        }

@RequestMapping ("/dosearchbyfirst")
public String doSearchByFirst(@RequestParam("first") String first, Model model) {
        model.addAttribute(recordRepository.findAllByFirst(first));

    return "userlist";
}
    @RequestMapping ("/dosearchbylast")
    public String doSearchByLast(@RequestParam("last") String last, Model model) {
        model.addAttribute(recordRepository.findAllByLast(last));

        return "userlist";
    }


    @RequestMapping ("/dosearchbyschool")
    public String doSearchBySchool(@RequestParam("school") String school, Model model) {
        model.addAttribute(recordRepository.findAllBySchool(school));
        return "userlist";
    }

    @RequestMapping ("/dosearchbycompany")
    public String doSearchByCompany(@RequestParam("company") String company, Model model) {
        model.addAttribute(recordRepository.findAllByCompany(company));
        return "userlist";
    }


    @RequestMapping ("/dosearchbyskill")
    public String doSearchBySkill(@RequestParam("skill") String skill, Model model) {
        model.addAttribute(recordRepository.findAllBySkill(skill));
        return "userlist";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logout")
    public String goLogout() {
        return "login";
    }






}