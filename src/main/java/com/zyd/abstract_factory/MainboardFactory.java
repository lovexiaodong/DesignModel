package com.zyd.abstract_factory;

public class MainboardFactory {

    public static MainboardApi createMainboard(int type){
        MainboardApi api = null;
        if(1 == type){
            api = new GAMainboard(1156);
        }else if(2 == type){
            api = new MSIMainboard(936);
        }
        return api;
    }
}
