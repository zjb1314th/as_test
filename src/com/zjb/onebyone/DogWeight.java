package com.zjb.onebyone;

public class DogWeight {

    private String doaName;

    private Integer weight;

    private Integer dynamicWeight;

    public DogWeight(String dogName, Integer weight, Integer dynamicWeight) {
        this.doaName = dogName;
        this.weight = weight;
        this.dynamicWeight = dynamicWeight;
    }

    public String getDoaName() {
        return doaName;
    }

    public void setDoaName(String doaName) {
        this.doaName = doaName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDynamicWeight() {
        return dynamicWeight;
    }

    public void setDynamicWeight(Integer dynamicWeight) {
        this.dynamicWeight = dynamicWeight;
    }
}
