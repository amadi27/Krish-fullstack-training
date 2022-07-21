package Memento;

public class Applications {
    public static void main(String[]args){
        CareTaker careTaker = new CareTaker();
        Food_Cart food_cart =new Food_Cart();
        food_cart.addFood(new Food("cake"));
        food_cart.addFood(new Food("biscuit"));

        careTaker.saveFoods(food_cart);
        System.out.println(food_cart);

        food_cart.addFood(new Food("oil"));
        careTaker.saveFoods(food_cart);
        System.out.println(food_cart);

        food_cart.addFood(new Food("vegitables"));
        //careTaker.saveFoods(food_cart);
        System.out.println(food_cart);

        careTaker.revert(food_cart);
        System.out.println(food_cart);

        careTaker.revert(food_cart);
        System.out.println(food_cart);

        food_cart.addFood(new Food("chocolates"));
        //careTaker.saveFoods(food_cart);
        System.out.println(food_cart);

        careTaker.revert(food_cart);
        System.out.println(food_cart);

        careTaker.revert(food_cart);
        System.out.println(food_cart);

        careTaker.revert(food_cart);
        System.out.println(food_cart);
    }
}
