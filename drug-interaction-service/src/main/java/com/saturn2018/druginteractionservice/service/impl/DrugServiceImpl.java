package com.saturn2018.druginteractionservice.service.impl;

import com.saturn2018.druginteractionservice.model.Drug;
import com.saturn2018.druginteractionservice.service.api.DrugService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    //fake data
    private List<Drug> drugs = new ArrayList<>(
            Arrays.asList(new Drug("Lipitor", "CHL2", "Category2", "Prescribtion", "23")
            )
    );


    public List<Drug> getAllDrugs() { return drugs; }
}