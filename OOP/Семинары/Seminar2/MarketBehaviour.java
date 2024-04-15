package OOP.Семинары.Seminar2;
// MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет
//состояние магазина (принимает и отдает заказы).

import java.util.List;


public interface MarketBehaviour {
    void acceptToMarket(List<Actor> actors, Actor actor);

    void releaseFromMarket(List<Actor> actors, Actor actor);

    
} 

    

