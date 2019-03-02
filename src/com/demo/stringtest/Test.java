package com.demo.stringtest;

public class Test {

    public static void main(String[] arg ){
        Complex complex =   new Complex(10,20);
        Complex complex1 =   new Complex(10,20);

        if(complex== complex1){
            System.out.println("--Equal");
        } else {
            System.out.println("---Not Equal------");
        }

        if(complex.equals(complex1)){
            System.out.println("--Equal");
        } else {
            System.out.println("---Not Equal------");
        }

    }
}
