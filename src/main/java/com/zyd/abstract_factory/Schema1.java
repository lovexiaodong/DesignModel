package com.zyd.abstract_factory;

public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPU() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainBoard() {
        return new GAMainboard(1156);
    }
}
