package com.demo.stringtest;

/**
 *
 * OverridingEquals
 *
 */
public class Complex {

    private double re, im;

    public Complex(){

    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Complex)){
            return false;
        }

        Complex complex = (Complex)obj;

        if( Double.compare(complex.re , re) == 0 && Double.compare(complex.im, im) == 0){

        }

        return  Double.compare(complex.re , re) == 0
        && Double.compare(complex.im, im) == 0;



    }
}
