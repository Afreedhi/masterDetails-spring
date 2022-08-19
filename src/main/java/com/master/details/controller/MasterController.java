package com.master.details.controller;

import com.master.details.model.Details;
import com.master.details.model.Master;
import com.master.details.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("masters")
@CrossOrigin(origins = "*")
public class MasterController {
    @Autowired
    private MasterService masterService;
    @GetMapping
    public List<Master> getMaster() {
        return masterService.getMaster();
    }


    @PostMapping
    public Boolean addMaster(@RequestBody Master master) {

        try {
            System.out.println("add works");
            masterService.addMaster(master);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

//    @GetMapping
//    public List<Master> getDetails(){return masterService.getDetails();
//    }
//
//    @PostMapping(value="/details")
//    public Boolean addDetails(@RequestBody Master master) {
//
//        try {
//            System.out.println("add works");
//            masterService.addDetails(master);
//            return true;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return false;
//    }
}
