package com.master.details.controller;
import com.master.details.model.Day;
import com.master.details.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("day")
@CrossOrigin(origins = "*")

public class DayController {
    @Autowired
    private DayService dayService;

    @GetMapping
    public List<Day> getDay(){return dayService.getDay();
    }
    @PostMapping
    public Boolean addDay(@RequestBody Day day) {
        try{

                System.out.println("add works");
                dayService.addDay(day);
                return true;
            } catch (Exception e) {
                System.out.println(e);
            }
            return false;
        }

    }


