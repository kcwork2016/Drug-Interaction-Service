package com.saturn2018.druginteractionservice.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {

    @RequestMapping("/drugs")
        public String getAlldrugs() {
            return "All drugs";
        }

    @RequestMapping("/chemicals")
    public String getAllChemicals() {
        return "All chemicals";
    }

    @RequestMapping("/foods")
    public String getAllfoods() {
        return "All foods";
    }

    @RequestMapping("/patiens")
    public String getAllPatiens() {
        return "All patients";
    }

}
