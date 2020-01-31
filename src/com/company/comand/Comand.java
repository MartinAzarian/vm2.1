package com.company.comand;

import com.company.exeption.ComandExeption;
import com.company.product.ProductType;
import com.company.VendMachine;

public class Comand {
    private ProductType productType;
    private int theProduct;

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

    public Comand(char[] array) {

        this.theProduct = (int) array[2];

        if(array[0] == 'A' || array[0] == 'a')
        {
            productType = ProductType.CANDY;
        }
        else if(array[0] == 'B' || array[0] == 'b')
        {
            productType = ProductType.DRINKS;
        }
        else if(array[0] == 'C' || array[0] == 'c')
        {
            productType = ProductType.CRIPS;
        }
        else {throw new ComandExeption("Not valid comand");}

        if (theProduct - 48 > 3 )
        {
            throw new ComandExeption("digit case is not valid");
        }

        VendMachine vendMachine = new VendMachine(theProduct - 48, productType);
    }
}

