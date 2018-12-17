package com.zyd.abstract_factory;

public class Client1 {

    public static void main(String[] args) {
       Schema1 schema1 = new Schema1();
       ComputerEngineer2 engineer2 = new ComputerEngineer2();
       engineer2.makeComputer(schema1);
    }
}
