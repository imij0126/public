package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery {
    private String name;
    private String phone;

    public Lottery() {}

    public Lottery(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "(" + phone + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lottery lottery = (Lottery) o;
        return Objects.equals(name, lottery.name) && Objects.equals(phone, lottery.phone);
        //if (obj instanceof Lottery) {
        //    Lottery others = (Lottery) obj;
        //    if (this.name.equals(others.name)
        //        && this.phone.equals(others.phone)){
        //        return true;
        //    }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
        // String hash = name + phone;
        // return hash.hashCode();
    }
}
