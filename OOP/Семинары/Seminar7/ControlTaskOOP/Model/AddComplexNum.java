package Семинары.Seminar7.ControlTaskOOP.Model;

public class AddComplexNum extends VariablesComplexNum{


    public AddComplexNum(ComplexNumber a, ComplexNumber b, char op) {
        super(a, b, op);

    }
    
    public AddComplexNum(){

    }

    @Override
    public double getReal(ComplexNumber a, ComplexNumber b) {
        Double real = a.getReal() + b.getReal();
        return real;
    }

    @Override
    public double getImagine(ComplexNumber a, ComplexNumber b) {
        Double imagine = a.getImagine() + b.getImagine();
        return imagine;
    }



}
