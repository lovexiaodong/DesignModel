package com.zyd.abstract_factory;

public class ComputerEngineer {

    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void makeComputer(int cpuType, int mainBoardType){
        prepareHardware(cpuType, mainBoardType);
    }

    private void prepareHardware(int cpuType, int mainBoardType) {

        cpu = CPUFactory.createCPU(cpuType);
        mainboard = MainboardFactory.createMainboard(mainBoardType);
        cpu.calculate();
        mainboard.installCPC();
    }
}
