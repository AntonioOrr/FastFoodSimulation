/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5testproject;

/**
 *
 * @author jlsin, Antonio
 */
public class BurgerOrder {
    
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private Boolean orderTOGO = false;
    private int orderNum = 1;

    /**
     *
     * @param Hamburgers
     * @param Cheeseburgers
     * @param Veggieburgers
     * @param Sodas
     * @param isToGo
     * @param orderN
     */
    public BurgerOrder(int Hamburgers,int Cheeseburgers, int Veggieburgers, int Sodas, Boolean isToGo,int orderN) {
        numHamburgers = Hamburgers;
        numCheeseburgers = Cheeseburgers;
        numVeggieburgers = Veggieburgers;
        numSodas = Sodas;
        orderTOGO = isToGo;
        orderNum = orderN;
    }

    /**
     * Get the value of orderNum
     *
     * @return the value of orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * Set the value of orderNum
     *
     * @param orderNum new value of orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * Get the value of orderTOGO
     *
     * @return the value of orderTOGO
     */
    public Boolean isOrderTOGO() {
        return orderTOGO;
    }

    /**
     * Set the value of orderTOGO
     *
     * @param orderTOGO new value of orderTOGO
     */
    public void setOrderTOGO(Boolean orderTOGO) {
        this.orderTOGO = orderTOGO;
    }

    /**
     * Get the value of numSodas
     *
     * @return the value of numSodas
     */
    public int getNumSodas() {
        return numSodas;
    }

    /**
     * Set the value of numSodas
     *
     * @param numSodas new value of numSodas
     */
    public void setNumSodas(int numSodas) {
        if(numSodas <0){
            System.out.println("Error: parameter is less than zero!");
        }else{
        this.numSodas = numSodas;
    }
    }

    /**
     * Get the value of numVeggieburgers
     *
     * @return the value of numVeggieburgers
     */
    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    /**
     * Set the value of numVeggieburgers
     *
     * @param numVeggieburgers new value of numVeggieburgers
     */
    public void setNumVeggieburgers(int numVeggieburgers) {
        if(numVeggieburgers <0){
            System.out.println("Error: parameter is less than zero!");
        }else{
        this.numVeggieburgers = numVeggieburgers;
    }
    }
    
    /**
     * Get the value of numHamburgers
     *
     * @return the value of numHamburgers
     */
    public int getNumHamburgers() {
        return numHamburgers;
    }

    /**
     * Set the value of numHamburgers
     *
     * @param numHamburgers new value of numHamburgers
     */
    public void setNumHamburgers(int numHamburgers) {
        if(numHamburgers <0){
            System.out.println("Error: parameter is less thsan zero!");
        }else{
        this.numHamburgers = numHamburgers;
    }
   }
    /**
     * Get the value of numCheeseburgers
     *
     * @return the value of numCheeseburgers
     */
    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    /**
     * Set the value of numCheeseburgers
     *
     * @param numCheeseburgers new value of numCheeseburgers
     */
    public void setNumCheeseburgers(int numCheeseburgers) {
        if(numCheeseburgers < 0){
            System.out.println("Error: parameter is less than zero!");
        }else{
        this.numCheeseburgers = numCheeseburgers;
    }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderTOGO=" + orderTOGO + ", orderNum=" + orderNum + '}';
    }
    
}