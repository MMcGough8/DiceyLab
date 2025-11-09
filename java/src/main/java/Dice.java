



public class Dice {

    private int sides;
    private int lastRoll;

    public Dice(int sides) {
        this.sides = sides;        
    }

    public int roll() {
        lastRoll = (int)(Math.random() * sides) + 1;
        return lastRoll;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getSides() {
        return sides;
    }



}


