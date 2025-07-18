package ru.netology.service;

public class CustomsService {
    public static final int calculateCustoms(int x, int y) {
        int total = x/100 + y * 100;
        return total;
    }
}
