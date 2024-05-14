package Семинары.Seminar7.ControlTaskOOP.Controller;

import Семинары.Seminar7.ControlTaskOOP.Model.VariablesComplexNum;
import Семинары.Seminar7.ControlTaskOOP.Service.ComplexNumCalcServis;

public class ComplexNumCalcController {

    
    public static VariablesComplexNum calculate(char op){
        ComplexNumCalcServis calcServis = new ComplexNumCalcServis();
        return  calcServis.calculate(op);
    }
}
