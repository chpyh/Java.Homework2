package OOP.Семинары.Seminar2;
//Методы из интерфейса QueueBehaviour, имитируют работу очереди, 

import java.util.List;

public interface QueueBehaviour {
    void takeQueue(Actor actor, List<Actor> actors);

    void takeOrder();

    void giveOrder();

    void outOfQueue(Actor actor, List<Actor> actors);
    
} 
