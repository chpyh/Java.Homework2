package Семинары.Seminar7.ControlTaskOOP.Model;

public abstract class VariablesComplexNum implements GetImagineResultInterface, GetRealResultInterface{
    protected ComplexNumber a;
    protected ComplexNumber b;
    protected char op;

    public VariablesComplexNum(ComplexNumber a, ComplexNumber b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public VariablesComplexNum() {

    }

    public ComplexNumber getA() {
        return a;
    }

    public void setA(ComplexNumber a) {
        this.a = new ComplexNumber();
    }

    public ComplexNumber getB() {
        return b;
    }

    public void setB(ComplexNumber b) {
        this.b = new ComplexNumber();
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }


}
