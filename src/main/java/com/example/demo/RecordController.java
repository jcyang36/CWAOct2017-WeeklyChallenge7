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
          /*  Iterable<Record> recordList = recordRepository.findAll();
            model.addAttribute("recordList", recordList);*/
            model.addAttribute(new Record());
            return "index";
        }



        /*@PostMapping("/addsubmit")
        public String addSubmit(@ModelAttribute Record record, Model model) {
            Iterable<Record> recordList = this.recordRepository.findAll();
            model.addAttribute("recordList", recordList);
            this.recordRepository.save(record);
            return "redirect:/";
        } */
        @RequestMapping(value = "/userlist")
        public String goUserList(@ModelAttribute Record record, Model model) {


            Iterable<Record> recordList = this.recordRepository.findAllByFirst("Bob");
            model.addAttribute("recordList", recordList);


            return "userlist";
        }

@PostMapping ("/dosearch")
public String doSearch(Model model) {
    Iterable<Record> recordList = this.recordRepository.findAllByFirst("Bob");
    model.addAttribute("recordList", recordList);


    return "userlist";
   /* Iterable<Record> recordList = this.recordRepository.findAllByFirst(searchTerm);

    model.addAttribute("recordList", recordList);
    return "redirect:/";*/

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