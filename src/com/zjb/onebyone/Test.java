package com.zjb.onebyone;

import java.util.HashMap;
import java.util.Map;

/**
 * 平滑加权轮询算法
 */
public class Test {

    private static Map<String, DogWeight> dogWeightMap = new HashMap<>();

    private static Integer totalWeight = 0;

    static {
        for(String dogName : Dogs.DOG_MAP.keySet()) {
            Integer weight = Dogs.DOG_MAP.get(dogName);
            dogWeightMap.put(dogName, new DogWeight(dogName, weight, 0));
            totalWeight += weight;
        }
    }

    public static String getDog() {
        DogWeight selectedDog = null;

        for(DogWeight dogWeight : dogWeightMap.values()) {
            dogWeight.setDynamicWeight(dogWeight.getWeight() + dogWeight.getDynamicWeight());
        }

        for(DogWeight dogWeight : dogWeightMap.values()) {
            if(selectedDog == null || dogWeight.getDynamicWeight() > selectedDog.getDynamicWeight()) {
                selectedDog = dogWeight;
            }
        }

        selectedDog.setDynamicWeight(selectedDog.getDynamicWeight() - totalWeight);

        return selectedDog.getDoaName();
    }

    public static void main(String[] args) {
        for (int i = 0; i < totalWeight; i++) {
            System.out.println(getDog());
        }
    }
}
