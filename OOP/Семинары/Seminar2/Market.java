package OOP.Семинары.Seminar2;

import java.util.List;


// 1. Реализовать класс Market и все методы, которые он обязан реализовывать.
// 2. Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//     MarketBehaviour – помещает и удаляет человека из очереди, метод 
//     update – обновляет состояние магазина (принимает и отдает заказы).

public class Market implements MarketBehaviour, QueueBehaviour{
//инициализируем очередь

    @Override
    public void takeQueue(Actor actor, List<Actor> actors) {// встать в очередь
        actors.add(actor);
        System.out.println("Клиент " + actor + " встал в очередь");
    
    }

    @Override
    public void takeOrder() {// принять заказ в очередь
        System.out.println("Заказ принят");
       
    }

    @Override
    public void giveOrder() {//отдать заказ
        System.out.println("Заказ выдан");
        
    }

    @Override
    public void outOfQueue(Actor actor, List<Actor> actors) {//
            int index = actors.indexOf(actor);
            actors.remove(index);
            System.out.println("Обслуживание " + actor + " завершено");

        System.out.println("В очереди осталось " + actors.size() + " клиентов");
        
    }

    @Override
    public void acceptToMarket(List<Actor> actors, Actor actor) {//войти в магазин
        actors.add(actor);
        System.out.println("В магазине новый посетитель: " + actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors, Actor actor) {
//покинуть магазин
        {
           int index = actors.indexOf(actor);
           actors.remove(index);
           System.out.println("Клиент " + actor + " ушел из магазина");
            
        }
    }


}
