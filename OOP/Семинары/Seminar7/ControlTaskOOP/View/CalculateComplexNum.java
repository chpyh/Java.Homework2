package Семинары.Seminar7.ControlTaskOOP.View;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

import Семинары.Seminar7.ControlTaskOOP.Model.ComplexNumber;
import Семинары.Seminar7.ControlTaskOOP.Model.Numbers;

import java.util.logging.Logger;

public class CalculateComplexNum {
    Logger logger = Logger.getLogger(CalculateComplexNum.class.getName());
    OpNumResultView calculate = new OpNumResultView();
    ComplexNumber a;
    ComplexNumber b;
    Numbers result;
    char op;

    public void calculate() throws ArithmeticException {
        try {
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter sFormat = new SimpleFormatter();// классический текстовый формат
            fileHandler.setFormatter(sFormat);
            try {
                System.out.println("Введите переменную");
                a = new ComplexNumber(calculate.getNumber(), calculate.getNumber());
                System.out.println("Введите переменную");
                b = new ComplexNumber(calculate.getNumber(), calculate.getNumber());
                System.out.println(
                        "Введите оператор:\n сложение - {+};\n вычитание - {-};\n умножение - {*};\n деление - {/}.");
                op = calculate.getOperation();
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    if (b.getReal() == 0 && b.getImagine() == 0 && op == '/') {
                        throw new ArithmeticException("Попытка деления на ноль.");

                    } else {
                        result = calculate.getResult(op, a, b);
                        System.out.println(result);
                        // logger.log(Level.INFO,
                        //         "Пользователь ввел: " + a + ", " + b + ", " + op + ", результат:" + result);
                    }
                } else {
                    System.out.println("Введен некорректный оператор");
                    logger.log(Level.WARNING, "Пользователь ввел некорректный оператор");
                }
            } catch (InputMismatchException e) {
                logger.log(Level.WARNING, "Введен неверный символ: преобразование в число невозможно.");
            } catch (Exception e) {
                logger.log(Level.WARNING, e.getMessage());
            }
        } catch (IOException e) {

            logger.warning("Ошибка записи в файл ");
        }
    }


}
