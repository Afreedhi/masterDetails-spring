package com.master.details.service;

import com.master.details.model.Details;
import com.master.details.model.Master;
import com.master.details.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class MasterService {
@Autowired
    MasterRepository masterRepository;
    public List<Master> masterList = new CopyOnWriteArrayList<>();
    public Master addMaster(Master master) {
        return masterRepository.insert(master);
    }
        public List<Master> getMaster() {
            {
                return (List<Master>) masterRepository.findAll();
            }
        }
        public Master getMaster(String no){
            Optional<Master> optional =masterRepository.findById(no);
            if(optional.isPresent()){
                return optional.get();
            }else{
                return null;
            }
        }
//    public List<Master> detailsList = new CopyOnWriteArrayList<>();
//    public Master addDetails(Master master) {
//        return masterRepository.insert(master);
//    }
//    public List<Master> getDetails() {
//        {
//            return (List<Master>) masterRepository.findAll();
//        }
//    }
//    public Master getDetails(String id){
//        Optional<Master> optional =masterRepository.findById(id);
//        if(optional.isPresent()){
//            return optional.get();
//        }else{
//            return null;
//        }
//    }
    }



