package com.master.details.service;

import com.master.details.model.ReferenceMaster;
import com.master.details.repository.ReferenceMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class ReferenceMasterService {
    @Autowired
    ReferenceMasterRepository referenceMasterRepository;
    public List<ReferenceMaster> referenceMasterList = new CopyOnWriteArrayList<>();

    public ReferenceMaster addReferenceMaster(ReferenceMaster referenceMaster) {
        return referenceMasterRepository.insert(referenceMaster);
    }

    public List<ReferenceMaster> getReferenceMaster() {
        {
            return (List<ReferenceMaster>) referenceMasterRepository.findAll();
        }
    }

    public ReferenceMaster getReferenceMaster(String no) {
        Optional<ReferenceMaster> optional = referenceMasterRepository.findById(no);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return null;
        }
    }
}