public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools burger = new BurgerTools();
        burger.mostPopularTopping = "cheese";
        burger.averageDaysBeforeExpiration = 3;
        burger.temperatureWhenCooked = 350;

        burger.grill();

        System.out.println(burger.mostPopularTopping);
        System.out.println(burger.averageDaysBeforeExpiration);
        System.out.println(burger.temperatureWhenCooked);

        burger.buildBurger("bacon", 3, 425);

        System.out.println(burger.mostPopularTopping);
        System.out.println(burger.averageDaysBeforeExpiration);
        System.out.println(burger.temperatureWhenCooked);

    }
}
