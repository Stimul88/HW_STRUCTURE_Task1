package ru.netology.service;

public class CustomsService {
    public static final int DUTY_RATE = 100;

    public static int calculateCustoms(int price, int weight) {
        int total = price/DUTY_RATE + weight * DUTY_RATE;
        return total;
    }
}
