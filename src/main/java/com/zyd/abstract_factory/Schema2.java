package com.zyd.abstract_factory;

public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPU() {
        return new AMDCPU(929);
    }

    @Override
    public MainboardApi createMainBoard() {
        return new MSIMainboard(929);
    }
}
