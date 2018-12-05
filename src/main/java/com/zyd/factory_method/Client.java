package com.zyd.factory_method;

public class Client {

    public static void main(String[] args) {

        ExportOperate operate = new ExportTextFileOperate();
        operate.export("测试数据");

        operate = new ExportDBOperate();
        operate.export("测试数据");
    }
}
