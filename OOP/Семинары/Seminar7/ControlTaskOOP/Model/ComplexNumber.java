package Семинары.Seminar7.ControlTaskOOP.Model;


public class ComplexNumber extends Numbers {
    private double imagine;


    public ComplexNumber(double real, double imagine){
        super(real);
        this.imagine = imagine;
    }

    public ComplexNumber(){

    }
    public double getImagine() {
        return imagine;
    }

    public void setImagine(Double imagine) {
        this.imagine = imagine;
        }
    
        @Override
        public String toString() {
            return real + " + " + imagine + "i";
        }

}