package com.kh.ch09_interface;

public class Lavender extends Plant{
    public Lavender(String name){
        this.name=name;
    }
    @Override
    public void sprinkleWater(){
        // 3 증가
        int n = getNutrients();
        setNutrients(n+3);
    }
    @Override
    public void baskSun(){
        int n = getNutrients();
        setNutrients(n+7);
    }
    @Override
    public String toString(){
        return "name = " + name + ", nutrients = " + getNutrients();
    }
}
