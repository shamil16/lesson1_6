package com.company;

import java.util.Objects;

public class Skeleton extends Boss {


    public int getArrow() {
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    private int arrow;

    public Skeleton(int damage, int health, int arrow) {
        super(damage, health);
        this.arrow = arrow;
    }

    public  String info (){
        return  super.info() + " "+ arrow;
    }
}
