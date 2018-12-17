package com.zyd.abstract_factory;

public class MSIMainboard implements MainboardApi {

    //CPU插槽的孔数
    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPC() {
        System.out.println("微星主板 CPU插槽孔数： " + cpuHoles);
    }
}
