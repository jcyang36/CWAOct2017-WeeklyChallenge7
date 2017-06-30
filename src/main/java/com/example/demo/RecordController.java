package com.example.demo;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


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


            return "userlist";
        }


    @RequestMapping("/user")
    public String goUser(Model model, @RequestParam("first") String first, String middle, String last, String email, String degree, String field, String school, String YearGrad,
                         String workTitle, String company, String workDur, String duty, String skill, String proficiency) {
		/*    Output for names  */

        model.addAttribute("FirstLine", first+" "+middle+" "+last);
        model.addAttribute("email", email);

		/* Output for names  */

		/* Output for education  */
        model.addAttribute("education", degree+" in "+field+" <br/>"+school+", "+YearGrad);


		/*  Output for education  */

		/*  Output for work   */
        model.addAttribute("work" , workTitle +" <br/>"+company+", "+workDur+" <br/>"+duty);


		/*  Output for work  */

		/* Output for skills  */
        model.addAttribute("skill" , skill+", "+proficiency);



    /*  Output for skills  */
        model.addAttribute(new Record());
        return "user";
    }

@RequestMapping ("/dosearchbyfirst")
public String doSearchByFirst(@RequestParam("first") String first, Model model) {
        model.addAttribute(recordRepository.findAllByFirst(first));

    return "user";
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