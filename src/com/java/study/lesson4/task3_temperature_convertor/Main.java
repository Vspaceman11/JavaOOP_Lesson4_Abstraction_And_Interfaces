package com.java.study.lesson4.task3_temperature_convertor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        System.out.println("Enter first letter of temperature scale you want to convert: (F)-fahrenheit, (K)-kelvin:");
        String scale = input.next().toLowerCase();
        System.out.println("Enter degrees:");
        double degree = input.nextDouble();
            if (scale.equals("f")) {
                System.out.println("°C° " + degree + " = " + "°F " + temperatureConverter.convertToFahrenheit(degree));
            } else if (scale.equals("k")) {
                System.out.println("°C " + degree + " = " + "K " + temperatureConverter.convertToKelvin(degree));
            } else
                System.out.println("Incorrect statement, try again");
    }
}
