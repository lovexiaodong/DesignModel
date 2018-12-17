package com.zyd.abstract_factory;

public class ComputerEngineer2 {

    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void makeComputer(AbstractFactory factory){
        prepareHardware(factory);
    }

    private void prepareHardware(AbstractFactory factory) {

        cpu = factory.createCPU();
        mainboard = factory.createMainBoard();
        cpu.calculate();
        mainboard.installCPC();
    }
}
