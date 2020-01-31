package com.company.comand;

import com.company.comand.Comand;

public class ConvertToComand {

    private char[] comand = new char[3];

    public ConvertToComand(String userComand) {

        intilizationComand(userComand);
        Comand comand = new Comand(this.comand);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private char[] intilizationComand(String userComand)
    {

        for (int i = 0; i < comand.length; i++) {

            this.comand[i] = userComand.charAt(i);
        }
        return this.comand;
    }
}