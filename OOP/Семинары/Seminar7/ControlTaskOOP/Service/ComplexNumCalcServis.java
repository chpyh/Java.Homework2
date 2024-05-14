package Семинары.Seminar7.ControlTaskOOP.Service;

import Семинары.Seminar7.ControlTaskOOP.Model.AddComplexNum;
import Семинары.Seminar7.ControlTaskOOP.Model.DivideComplexNUm;
import Семинары.Seminar7.ControlTaskOOP.Model.MultyplyComplexNum;
import Семинары.Seminar7.ControlTaskOOP.Model.SubstractComplexNum;
import Семинары.Seminar7.ControlTaskOOP.Model.VariablesComplexNum;

public class ComplexNumCalcServis {
    public VariablesComplexNum calculate(char op){

    if (op == '+') {
        return new AddComplexNum();
    } else if (op == '-') {
        return new SubstractComplexNum();
    }else if (op == '*') {
        return new MultyplyComplexNum();
    }else {
        return new DivideComplexNUm();
        }
    }
}
    