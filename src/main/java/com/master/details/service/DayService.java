package com.master.details.service;
import com.master.details.model.Day;
import com.master.details.repository.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class DayService {
    @Autowired
    DayRepository dayRepository;
    public List<Day> dayList = new CopyOnWriteArrayList<>();
    public Day addDay(Day day) {
        return dayRepository.insert(day);
    }
    public List<Day> getDay() {
        {
            return (List<Day>) dayRepository.findAll();
        }
    }
    public Day getDay(String no){
        Optional<Day> optional =dayRepository.findById(no);
        if(optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }

}


