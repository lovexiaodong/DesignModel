package com.zyd.factory_method;

public class ExportDBOperate extends ExportOperate {

    protected ExportFileAPI factoryMethod() {
        return new ExportDB();
    }
}
