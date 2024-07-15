package com.kh.chap01_beforeVSafter.before.model.vo.Product;

public class Smartphone extends Product{
    private String mobileAgency;
    public Smartphone(){}
    public String information(){
        return super.information() +" mobileAgency = "+mobileAgency;
    }
    public Smartphone(String brand, String code, String name, int price, String mobileAgency) {
        super(brand, code, name, price);
        this.mobileAgency = mobileAgency;
    }
    public String getMobileAgency() {
        return mobileAgency;
    }
    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }
}
