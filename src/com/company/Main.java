package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 54321;
	int w = a / 10000;
	int q = a / 1000%10;
	int e = a / 100%10;
	int r = a / 10%10;
	int t = a % 10;

            System.out.println("N:" + (w + q + e + r + t));
    }
}
