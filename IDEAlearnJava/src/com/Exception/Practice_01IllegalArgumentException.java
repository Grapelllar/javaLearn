package com.Exception;

import java.util.Scanner;

public class Practice_01IllegalArgumentException {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer a = s.nextInt();
        if (a.intValue() < 0) {
            System.out.println("-----");
            throw new IllegalArgumentException();
        }
    }
}
