package extrapractice.constructor;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Good Restaurant", 8);

        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println(restaurant.getMenu());

    }
}
