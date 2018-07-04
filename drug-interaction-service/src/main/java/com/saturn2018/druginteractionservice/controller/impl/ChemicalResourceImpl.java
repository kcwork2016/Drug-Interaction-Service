package com.saturn2018.druginteractionservice.controller.impl;

import com.saturn2018.druginteractionservice.model.Chemical;
import com.saturn2018.druginteractionservice.service.api.ChemicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.saturn2018.druginteractionservice.controller.api.ChemicalResource;

import java.util.List;

@Component
public class ChemicalResourceImpl  implements ChemicalResource{

    @Autowired
    private ChemicalService chemicalService;

    @Override
    public List<Chemical> getAllChemicals() {return chemicalService.getAllChemicals();}
}
