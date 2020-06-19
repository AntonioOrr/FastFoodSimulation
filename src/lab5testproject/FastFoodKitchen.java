/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5testproject;
import java.util.ArrayList;
/**
 *
 * @author jlsin, Antonio
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList();
    
    private static int nextOrderNum;
public FastFoodKitchen() {
//Order #0, 1, and 2 to be used as waitlist for newly inputted orders
orderList.add(new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum()));
incrementNextOrderNum();
orderList.add(new BurgerOrder(0,0,3,3,true,getNextOrderNum()));
incrementNextOrderNum();
orderList.add(new BurgerOrder(1,1,0,2,false, getNextOrderNum()));
incrementNextOrderNum();

}
    /**
     * Get the value of nextOrderNum
     *
     * @return the value of nextOrderNum
     */
    public static int getNextOrderNum() {
        //gets order number
        return nextOrderNum;
    }
private static void incrementNextOrderNum(){
nextOrderNum++;
}
public int addOrder(int ham, int cheese, int veggie, int soda, boolean TOGO){
    BurgerOrder newOrder = new BurgerOrder(ham,cheese,veggie,soda, TOGO, getNextOrderNum());
    orderList.add(newOrder);
    incrementNextOrderNum();
    return newOrder.getOrderNum();
}
public boolean isOrderDone(int orderID){
    for (int i = 0; i < orderList.size(); i++){
    if (orderList.get(i).getOrderNum() == orderID){
       return false; 
    }else { 
    }   
  }     return true;
}   
private void orderCallOut(BurgerOrder order){
        if (order.getNumCheeseburgers() > 0){
            System.out.println("There are " + order.getNumCheeseburgers() + " cheeseburger(s) in this order." );
        }
        if (order.getNumHamburgers() > 0){
            System.out.println("There are " + order.getNumHamburgers() + " hamburger(s) in this order." );
        }
        if (order.getNumVeggieburgers() > 0){
            System.out.println("There are " + order.getNumVeggieburgers() + " veggieburger(s) in this order." );
        }
        if (order.getNumSodas() > 0){
            System.out.println("There are " + order.getNumSodas() + " soda(s) in this order." );
        }
  }    

private void completeSpecificOrder(int orderID){
    for (int i = 0; i < orderList.size(); i++){
        if (orderList.get(i).getOrderNum() == orderID)   
            System.out.println("This order is done.");
        if (orderList.get(i).isOrderTOGO() == true){
             orderCallOut(orderList.get(i));
        }
        }
    }

private void completeNextOrder(){
    for (int i = 0; i < orderList.size(); i++){
        if (orderList.get(0).isOrderTOGO()){
             System.out.println("Order #" + orderList.get(0).getOrderNum() + " is done.");
             orderCallOut(orderList.get(0));
             orderList.remove(orderList.get(0));
    } else {
            System.out.println("Order #" + orderList.get(0).getOrderNum() + " is done.");
            orderList.remove(orderList.get(0));
        }
       
    }
}
public int getNumOrdersPending(){
    return orderList.size();
}
public void simulateKitchenActivity() {
    // see if there is anything to do        
    if (orderList.size() == 0) return;       // simulate how orders are completed, usually
    // first-in, first-out, but not always        
    int num = (int)(Math.random()*100);        
    if (num < 90) {            
    // 90% chance the kitchen completes the order that is at 
    // the front of the queue            
    completeNextOrder();       
    } 
    else {            // complete some random order      
    int size = orderList.size();           
    int id = (int)(Math.random()*size);       
    completeSpecificOrder(id);        }  
}

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
public boolean cancelOrder(int orderID){
    for (int i = 0; i < orderList.size(); i++){
        if (orderList.get(i).getOrderNum() == orderID){
            orderList.remove(orderList.get(i));
            return true;
        }
    }
    return false;
}
}