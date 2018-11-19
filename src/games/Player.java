package games;

public class Player {

    byte number = 0;

    public void guess() {
        number = (byte)(Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }

}
