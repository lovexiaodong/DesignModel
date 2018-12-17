package com.zyd.abstract_factory;

public class GAMainboard implements MainboardApi {

    //CPU插槽的孔数
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPC() {
        System.out.println("技嘉主板 CPU插槽孔数： " + cpuHoles);
    }
}
