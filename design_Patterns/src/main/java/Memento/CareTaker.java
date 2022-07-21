package Memento;

import java.util.Stack;

public class CareTaker {
    Stack<Food_Cart.FoodCartMemento> foodHistory = new Stack<>();
    public void saveFoods(Food_Cart food_cart) {
        foodHistory.push(food_cart.Save());

    }
    public void revert(Food_Cart food_cart){
        if(!foodHistory.isEmpty()){
            food_cart.revert(foodHistory.pop());
        }
        else{
            System.out.println("Can not go to back");
        }
    }
}
