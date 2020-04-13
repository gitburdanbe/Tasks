package com.tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MiHeadphones miHeadphone = new MiHeadphones("Mi Air ", "white");

        System.out.print("Please set the price($): ");
        miHeadphone.setPrice(scanner.nextInt());
    }
}
