public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();

        dish.costInCents = 100;
        dish.nameOfDish = "PB&J";
        dish.wouldRecommend = true;

        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);

        dish.eat();


    }
}
