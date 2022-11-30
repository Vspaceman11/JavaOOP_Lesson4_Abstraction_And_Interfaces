package com.java.study.lesson4.task1_abstract;

public class TXTHandler extends AbstractHandler{
    public void open(){
        System.out.println("Open TXT document");
    }
    public void create(){
        System.out.println("Create TXT document");
    }
    public void change(){
        System.out.println("Change TXT document");
    }
    public void save(){
        System.out.println("Save TXT document");
    }
}
