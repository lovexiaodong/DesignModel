package com.zyd.abstract_factory;

public class CPUFactory {

    public static CPUApi createCPU(int type){
        CPUApi cpuApi = null;
        if(1 == type){
            cpuApi = new IntelCPU(1156);
        }else if(2 == type){
            cpuApi = new AMDCPU(936);
        }

        return cpuApi;
    }
}
