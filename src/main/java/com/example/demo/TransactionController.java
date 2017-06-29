package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by student on 6/23/17.
 */
@Controller
public class TransactionController {




        @Autowired
        private TransactionRepository transactionRepository;

        @RequestMapping("/")
        public String home( Model model) {
            Iterable<Transaction> transactionList = transactionRepository.findAll();
            model.addAttribute("transactionList", transactionList);

            return "index";
        }

        @RequestMapping("/find")
        public String goAdd( Model model) {
            model.addAttribute(new Transaction());
            return "find";
        }

        @PostMapping("/addsubmit")
        public String addSubmit(@ModelAttribute Transaction transaction, Model model) {
           /* model.addAttribute(new Transaction());*/
           /*To add a record to a table, use save(transaction)*/
            Iterable<Transaction> transactionList = transactionRepository.findAll();
            model.addAttribute("transactionList", transactionList);
            transactionRepository.save(transaction);
            return "redirect:/";
        }
        @RequestMapping("/userlist")
        public String goBalance(@ModelAttribute Transaction transaction, Model model) {
            /*model.addAttribute(new Transaction());*/

            Iterable<Transaction> transactionList = transactionRepository.findAll();
            model.addAttribute("transactionList", transactionList);


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