package com.saturn2018.druginteractionservice.service.impl;
import com.saturn2018.druginteractionservice.model.Chemical;
import com.saturn2018.druginteractionservice.service.api.ChemicalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ChemicalServiceImpl implements ChemicalService {

    //fake data
    private List<Chemical> chemicals = new ArrayList<>(
            Arrays.asList(new Chemical(1, "water", "H2O", "clear water", "20ML", 2),
                    new Chemical(1, "water", "H2O", "clear water", "20ML", 2)
            )
    );

    public List<Chemical> getAllChemicals() { return chemicals; }
}
