package com.java.study.lesson4.task1_abstract;

public class XMLHandler extends AbstractHandler{
   public void open(){
      System.out.println("Open XML document");
   }
   public void create(){
      System.out.println("Create XML document");
   }
   public void change(){
      System.out.println("Change XML document");
   }
   public void save(){
      System.out.println("Save XML document");
   }
}
