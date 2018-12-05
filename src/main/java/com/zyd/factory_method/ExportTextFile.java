package com.zyd.factory_method;

public class ExportTextFile implements ExportFileAPI {

    public boolean export(String data) {

        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}
