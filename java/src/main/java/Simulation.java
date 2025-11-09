

public class Simulation {

    public static void main(String[] args) {

        Dice d6 = new Dice(6);
        Dice d20 = new Dice(20);
        Dice d100 = new Dice(100);

        System.out.println("Rolling a 6-sided dice: " + d6.roll());
        for (int i = 0; i < 5; i++) {
            int roll = d6.roll();
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }
        System.out.println("Last roll remember: " + d6.getLastRoll());
        System.out.println();

   
        System.out.println("Rolling a 20-sided dice again: " + d20.roll());
        for (int i = 0; i < 5; i++) {
            int roll = d20.roll();
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }
        System.out.println("Last roll remember: " + d20.getLastRoll());
        System.out.println();


        System.out.println("Rolling a 100-sided dice: " + d100.roll());
        for (int i = 0; i < 5; i++) {
            int roll = d100.roll();
            System.out.println("Roll " + (i + 1) + ": " + roll);
        }
        System.out.println("Last roll remember: " + d100.getLastRoll());
        System.out.println();
    }
        
}
