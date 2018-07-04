package com.saturn2018.druginteractionservice.controller.impl;

import com.saturn2018.druginteractionservice.controller.api.DrugResource;
import com.saturn2018.druginteractionservice.model.Drug;
import com.saturn2018.druginteractionservice.service.api.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrugResourceImpl implements DrugResource {

    @Autowired
    private DrugService drugService;

    public List<Drug> getAllDrugs() { return drugService.getAllDrugs(); }
}