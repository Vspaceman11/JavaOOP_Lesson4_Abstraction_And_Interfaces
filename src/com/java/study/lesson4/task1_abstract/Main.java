package com.java.study.lesson4.task1_abstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DOCHandler doc = new DOCHandler();
        TXTHandler txt = new TXTHandler();
        XMLHandler xml = new XMLHandler();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter document format: doc, xml, txt.");
        String userFormat = input.next().toLowerCase();

        if (userFormat.equals("doc")){
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        } else if (userFormat.equals("txt")) {
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        } else if (userFormat.equals("xml")) {
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        } else
            System.out.println("Incorrect document format, try again.");
    }
}
