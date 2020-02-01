package com.company;

import com.company.product.ProductType;
import com.company.product.candy.Kitkat;
import com.company.product.candy.Snickers;
import com.company.product.candy.Twix;
import com.company.product.crips.Doritos;
import com.company.product.crips.Lays;
import com.company.product.crips.Pringles;
import com.company.product.drinks.Cola;
import com.company.product.drinks.Fanta;
import com.company.product.drinks.Pepsi;
import com.company.product.Product;

import java.util.ArrayList;
import java.util.HashMap;


public class VendMachine {
    private HashMap<ProductType, ArrayList<Product>> productBoard = new HashMap<>();
    private int theProduct;
    private ProductType productType;

    public VendMachine(int theProduct, ProductType productType ) {

        this.theProduct = theProduct;
        this.productType = productType;

        initilizeBoard()
        printProductBoard();

        getProduct(this.productType, theProduct);

    }


    private void initilizeBoard() {
        
        ArrayList<Product> drinks = new ArrayList<>();
        ArrayList<Product> candys = new ArrayList<>();
        ArrayList<Product> crisps = new ArrayList<>();

        for ( int i = 0; i < 10; i++ ) {
            
        Cola cola = new Cola();
        Pepsi pepsi = new Pepsi();
        Fanta fanta = new Fanta();
            
        drinks.add(cola);
        drinks.add(fanta);
        drinks.add(pepsi);

        Kitkat kitkat = new Kitkat();
        Snickers snickers = new Snickers();
        Twix twix = new Twix();

        candys.add(kitkat);
        candys.add(snickers);
        candys.add(twix);

        Doritos doritos = new Doritos();
        Lays lays = new Lays();
        Pringles pringles = new Pringles();
            
        crisps.add(doritos);
        crisps.add(lays);
        crisps.add(pringles);
            
        }


        productBoard.put(ProductType.CANDY, candys);
        productBoard.put(ProductType.DRINKS, drinks);
        productBoard.put(ProductType.CRIPS,  crisps);

    }
    public void printProductBoard(){

        System.out.print(productBoard.get(ProductType.CRIPS).get(0).getClass() + " ");
        System.out.print(productBoard.get(ProductType.CRIPS).get(1).getClass() + " ");
        System.out.print(productBoard.get(ProductType.CRIPS).get(2).getClass() + " ");

        System.out.println(productBoard.get(ProductType.CANDY).get(0).getClass() + " ");
        System.out.print(productBoard.get(ProductType.CANDY).get(1).getClass() + " ");
        System.out.print(productBoard.get(ProductType.CANDY).get(2).getClass() + " ");

        System.out.println(productBoard.get(ProductType.CANDY).get(0).getClass() + " ");
        System.out.print(productBoard.get(ProductType.DRINKS).get(1).getClass() + " ");
        System.out.print(productBoard.get(ProductType.DRINKS).get(2).getClass() + " ");

    }
    public void getProduct(ProductType productType, int theProduct)
    {
        productBoard.get(productType).get(theProduct).getProduct();
        productBoard.remove(productType, theProduct);
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
}
