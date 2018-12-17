package com.zyd.abstract_factory;

public class AMDCPU implements CPUApi{

    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU 的针脚数" + pins);
    }
}
