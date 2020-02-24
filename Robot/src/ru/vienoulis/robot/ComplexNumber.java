package ru.vienoulis.robot;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.re, re) == 0 &&
                Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        long result = Double.doubleToLongBits(re + im);
        return (int) (result ^ result >>> 32);
    }

    //    public boolean equals(Object o){
//        if (o == null || this == null) return false;
//        if (o.getClass() == this.getClass()){
//            return this.im == ((ComplexNumber) o).im && this.re == ((ComplexNumber) o).re && o.hashCode() == this.hashCode();
//        } else return false;
//    }
//
//    public int hashCode(){
//        return ((int)this.re / 3) + ((int)this.im / 5);
//    }
}