package com.zyd.factory_method;

public class ExportTextFileOperate extends ExportOperate {

    protected ExportFileAPI factoryMethod() {
        return new ExportTextFile();
    }
}
