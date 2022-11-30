package com.java.study.lesson4.task1_abstract;

public class DOCHandler extends AbstractHandler{
    public void open(){
        System.out.println("Open DOC document");
    }
    public void create(){
        System.out.println("Create DOC document");
    }
    public void change(){
        System.out.println("Change DOC document");
    }
    public void save(){
        System.out.println("Save DOC document");
    }
}
