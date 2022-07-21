package Memento;

import java.util.ArrayList;

//originator
public class Food_Cart {
    ArrayList<Food> foods = new ArrayList<>();

    public void addFood(Food food){
        foods.add(food);
    }

   /* public void setFoods(ArrayList<Food> foods) {
        this.foods = (ArrayList<Food>)foods.clone() ;
    }*/

    public ArrayList<Food> getFoods() {
        return (ArrayList)foods.clone();
    }
    public FoodCartMemento Save(){
        return new FoodCartMemento(getFoods());
    }

    public void revert(FoodCartMemento foodCartMemento){
        foods=foodCartMemento.getFoods();
    }

    @Override
    public String toString() {
        return "Food_Cart{" +
                "foods=" + foods +
                '}';
    }

    static class FoodCartMemento{


        ArrayList<Food> foods;

        public FoodCartMemento(ArrayList<Food> foods) {
            this.foods = foods;
        }

        private ArrayList<Food> getFoods(){
            return foods;
        }

    }
}
