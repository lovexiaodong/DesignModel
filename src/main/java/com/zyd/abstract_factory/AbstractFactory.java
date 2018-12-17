package com.zyd.abstract_factory;

public interface AbstractFactory {

    CPUApi createCPU();

    MainboardApi createMainBoard();
}
