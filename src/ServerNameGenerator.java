import java.util.Random;

public class ServerNameGenerator {

    public static void wordBuilder(String adj, String noun) {
        System.out.println("\nHere is your server name: \n");
        System.out.printf("%s-%s%n", adj,noun);
    }

public static void main(String[] args) {
    Random rand = new Random();
    int randNum = rand.nextInt((10 - 1) + 1) + 1;

    String[] adj = {"warm", "fuzzy", "happy", "scared", "hungry", "silent", "heavy", "cold", "elaborate", "small"};
    String[] noun = {"turtle", "snake", "photon", "laser", "lion", "sloth", "slug", "lady", "man", "midget"};

    String randAdj = adj[randNum];
    String randNoun = noun[randNum];

    wordBuilder(randAdj, randNoun);

    }
}
