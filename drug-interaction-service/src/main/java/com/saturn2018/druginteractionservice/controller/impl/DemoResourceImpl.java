package com.saturn2018.druginteractionservice.controller.impl;

import com.saturn2018.druginteractionservice.controller.api.DemoResource;
import org.springframework.stereotype.Component;

@Component
public class DemoResourceImpl implements DemoResource {

    public String getStartTest() { return "Interaction Service Start"; }
}
