package Семинары.Seminar7;
// Создайте декоратор MessageDecorator, который будет добавлять дополнительную информацию 
//к текстовому сообщению (например, дату отправки).

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDecorator implements Message {
    private TextMessage message;

    public MessageDecorator(TextMessage message){
        this.message = message;

    }

    @Override
    public void sendMessage(String text) {
        message.sendMessage(text);
    }

    @Override
    public void getMessage() {
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Форматируем дату и время в удобочитаемую строку
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        // Выводим отформатированную дату и время
       System.out.println(message.getText() + " отправлено " + formattedDateTime);
        
    }

    
}
