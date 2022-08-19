package com.master.details.controller;
import com.master.details.model.Master;
import com.master.details.model.ReferenceMaster;
import com.master.details.service.MasterService;
import com.master.details.service.ReferenceMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("refrencemasters")
@CrossOrigin(origins = "*")
public class ReferenceMasterController {
    @Autowired
    private ReferenceMasterService referenceMasterService;

    @GetMapping
    public List<ReferenceMaster> getReferenceMaster() {
        return referenceMasterService.getReferenceMaster();
    }


    @PostMapping
    public Boolean addReferenceMaster(@RequestBody ReferenceMaster referenceMaster) {

        try {
            System.out.println("add works");
            referenceMasterService.addReferenceMaster(referenceMaster);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
