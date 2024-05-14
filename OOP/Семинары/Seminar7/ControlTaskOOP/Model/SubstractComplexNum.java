package Семинары.Seminar7.ControlTaskOOP.Model;

public class SubstractComplexNum extends VariablesComplexNum{

    public SubstractComplexNum(ComplexNumber a, ComplexNumber b, char op) {
        super(a, b, op);

    }

    public SubstractComplexNum() {

    }

    @Override
    public double getReal(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() - b.getReal();
        return real;

    }

    @Override
    public double getImagine(ComplexNumber a, ComplexNumber b) {
        double imagine = a.getImagine() - b.getImagine();
        return imagine;
    }

}
