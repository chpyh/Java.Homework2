package Семинары.Seminar3;

import java.util.Comparator;

// — Создать класс StreamComparator, 
//реализующий сравнение количества групп, 
//входящих в Поток;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream o1, Stream o2) {

        return o1.getSize() - o2.getSize();
        
    }

    
}
