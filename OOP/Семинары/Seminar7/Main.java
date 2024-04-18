package Семинары.Seminar7;
//Напишите клиентский код, который будет использовать декоратор для отправки и получения 
//текстовых сообщений с дополнительной информацией.

public class Main {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage("Hello, world!");
        MessageDecorator messageDecorator = new MessageDecorator(textMessage);
        messageDecorator.getMessage();
    

    }
}



