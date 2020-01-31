package com.company;

import com.company.comand.ConvertToComand;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        comandForConverter(userInputComand());
    }

    public static String userInputComand() {

        Scanner scanner = new Scanner(System.in);
        String userComand = scanner.nextLine();
        if (userComand.length() < 3)
        {
            throw new StringIndexOutOfBoundsException("lenght error");
        }
        return userComand;
    }

    public static void comandForConverter(String userComand) {

        ConvertToComand convertToComand = new ConvertToComand(userComand);
    }
}