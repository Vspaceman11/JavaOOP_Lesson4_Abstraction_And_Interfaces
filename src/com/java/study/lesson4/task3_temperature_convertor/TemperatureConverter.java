package com.java.study.lesson4.task3_temperature_convertor;

public class TemperatureConverter {
    public double convertToFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
    public double convertToKelvin(double celsius){
        return celsius + 273.15;
    }
}
