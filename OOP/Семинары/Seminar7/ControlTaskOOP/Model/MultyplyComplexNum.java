package Семинары.Seminar7.ControlTaskOOP.Model;

public class MultyplyComplexNum extends VariablesComplexNum {

    public MultyplyComplexNum(ComplexNumber a, ComplexNumber b, char op) {
        super(a, b, op);

    }

    public MultyplyComplexNum() {

    }

    @Override
    public double getReal(ComplexNumber a, ComplexNumber b) {
        double real = (a.getReal() * b.getReal()) - (a.getImagine() * b.getImagine());
        return real;

    }

    @Override
    public double getImagine(ComplexNumber a, ComplexNumber b) {
        double imagine = (a.getImagine() * b.getReal()) + (b.getImagine() * a.getReal());
        return imagine;
    }
}
