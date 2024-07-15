package com.kh.ch09_interface;

public class Monstera extends Plant {
    public Monstera(String name){
        this.name=name;
    }
    @Override
    public void sprinkleWater(){
        // nutrients 의 값을 10 증가
        int n = getNutrients();
        setNutrients(n+10);
    }
    @Override
    public void baskSun(){
        // nutrients 의 값을 20 증가
        int n = getNutrients();
        setNutrients(n+20);
    }
    @Override
    public String toString(){
        return "name = " +name + ", nutrients = " + getNutrients();
    }
}
