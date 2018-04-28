package com.saturn2018.druginteractionservice.model;

public class Chemical {
    private String name;
    private String formulaName;
    private String description;
    private String doesUnit;
    private int doesValue;

    public Chemical() {
    }

    public Chemical(String name, String formulaName, String description, String doesUnit, int doesValue) {
        this.name = name;
        this.formulaName = formulaName;
        this.description = description;
        this.doesUnit = doesUnit;
        this.doesValue = doesValue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormulaName() {
        return formulaName;
    }

    public void setFormulaName(String formulaName) {
        this.formulaName = formulaName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoesUnit() {
        return doesUnit;
    }

    public void setDoesUnit(String doesUnit) {
        this.doesUnit = doesUnit;
    }

    public int getDoesValue() {
        return doesValue;
    }

    public void setDoesValue(int doesValue) {
        this.doesValue = doesValue;
    }

}
