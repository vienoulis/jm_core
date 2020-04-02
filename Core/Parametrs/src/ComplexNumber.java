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

    public boolean equals(Object o){
        if (o.getClass() == this.getClass()){
            return this.im == ((ComplexNumber) o).im && this.re == ((ComplexNumber) o).re && o.hashCode() == this.hashCode();
        } else return false;
    }

    public int hashCode(){
        return ((int)this.re / 3) + ((int)this.im / 5);
    }
}
