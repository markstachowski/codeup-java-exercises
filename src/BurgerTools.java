public class BurgerTools {

    String mostPopularTopping;
    int averageDaysBeforeExpiration;
    int temperatureWhenCooked;
    public void grill () {
        System.out.println("Grilling burger");
    }

    public void buildBurger (String topping, int expiration, int temp) {
        this.mostPopularTopping = topping;
        this.averageDaysBeforeExpiration = expiration;
        this.temperatureWhenCooked = temp;
    }


}

