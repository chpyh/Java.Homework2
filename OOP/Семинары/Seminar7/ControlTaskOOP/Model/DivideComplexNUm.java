package Семинары.Seminar7.ControlTaskOOP.Model;

public class DivideComplexNUm extends VariablesComplexNum{
    
    public DivideComplexNUm(ComplexNumber a, ComplexNumber b, char op) {
        super(a, b, op);

    }
    
    public DivideComplexNUm(){

    }

    public double getDenominator(ComplexNumber a, ComplexNumber b){
        double denominator = (b.getReal() * b.getReal()) + (b.getImagine() * b.getImagine());
        return denominator;
    }
    @Override
    public double getReal(ComplexNumber a, ComplexNumber b) {
        double real = (a.getReal() * b.getReal() + a.getImagine() * b.getImagine())/ getDenominator(a, b);
        return real;
    }

    @Override
    public double getImagine(ComplexNumber a, ComplexNumber b) {
        double imagine = (a.getImagine() * b.getReal() - b.getImagine() * a.getReal())/ getDenominator(a, b);
        return imagine;
    }
}
