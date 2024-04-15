package OOP.Семинары.Seminar2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actor buyer1 = new Human("Николай");
        Actor buyer2 = new Human("Игорь");
        Actor buyer3 = new Human("Олеся");
        Actor buyer4 = new Human("Полина");

        List<Actor> buyers = new ArrayList<>();
        List<Actor> queue = new ArrayList<>();
        Market market = new Market();
        market.acceptToMarket(buyers, buyer1);
        market.takeQueue(buyer1, queue);
        market.acceptToMarket(buyers, buyer2);
        market.takeQueue(buyer2, queue);
        market.takeOrder();
        market.acceptToMarket(buyers, buyer3);
        market.takeQueue(buyer3, queue);
        market.giveOrder();
        market.outOfQueue(buyer1, queue);
        market.acceptToMarket(buyers, buyer4);
        market.releaseFromMarket(buyers, buyer1);
        
        
        

        // for (Actor human : buyers) {
        //     market.acceptToMarket(human); 
        // }

        // for (Actor human : buyers) {
        //     market.takeQueue(human); 
        //     market.takeOrder(); 
        //     market.giveOrder(); 
        //     market.outOfQueue();
            
        // }


        
    }
}