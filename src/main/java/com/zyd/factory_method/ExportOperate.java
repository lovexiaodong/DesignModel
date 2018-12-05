package com.zyd.factory_method;

public abstract class ExportOperate {

    protected abstract ExportFileAPI factoryMethod();

    public boolean export(String data){
        ExportFileAPI api = factoryMethod();
        return api.export(data);
    }
}
