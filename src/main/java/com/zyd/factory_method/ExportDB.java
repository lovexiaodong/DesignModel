package com.zyd.factory_method;

public class ExportDB implements ExportFileAPI {

    public boolean export(String data) {

        System.out.println("导出数据" + data + "到数据库");
        return true;
    }
}
