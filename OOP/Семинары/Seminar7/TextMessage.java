package Семинары.Seminar7;
//Реализуйте класс TextMessage, представляющий базовое текстовое сообщение.

public class TextMessage implements Message {
   private String text;

    public String getText() {
    return text;
}

// public void setText(String text) {
//     this.text = text;
// }

    public TextMessage(String text){
        this.text = text;

    }

    @Override
    public void sendMessage(String text) {
        this.text = text;
    }
    

    @Override
    public void getMessage() {
       System.out.println(text);
    }
    
}
