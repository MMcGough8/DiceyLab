

public class Simulation {

        private int numDice;
        private int numTrials;
        private int sidesPerDie;
        private Bins results;

       
    public Simulation(int numDice, int numTrials) {
        this.numDice = numDice;
        this.numTrials = numTrials;
        this.sidesPerDie = 6;
        
        int minValue = numDice;
        int maxValue = numDice * sidesPerDie;
        this.results = new Bins(minValue, maxValue);
    }

    public void runSimulation() {
        System.out.println("Running simulation: " + numDice + "d" + sidesPerDie + " rolled " + numTrials + " times...\n");

        Dice[] dice = new Dice[numDice];
        for (int i = 0; i <  numDice; i++) {
            dice[i] = new Dice(sidesPerDie);
    }

        for (int trial = 0; trial < numTrials; trial++) {
            int total = 0;

            for (int i = 0; i < numDice; i++) {
                total += dice[i].roll();
            }
            results.incrementBin(total);
        }
    }

    public void printResults() {
        System.out.println("SIMULATION RESULTS");
        System.out.println("==================");
        System.out.println("Dice: " + numDice + "d" + sidesPerDie);
        System.out.println("Trials: " + numTrials);
        System.out.println();

        System.out.println(" sum | Count | Percentage | Bar Chart ");
        System.out.println(" ----+-------+------------+---------- ");

        for (int sum = results.getMinValue(); sum <= results.getMaxValue(); sum++) {
            int count = results.getBin(sum);
            double percentage = (count * 100.0) / numTrials;

            int barLength = (int) (percentage *2);
            String bar = "*".repeat(barLength);

            System.out.printf("%4d | %6d | %6.2f%%  | %s\n",
                             sum, count, percentage, bar);
        }
    }   

        public static void main(String[] args) {
            Simulation sim = new Simulation(2,1000000);

            sim.runSimulation();

            sim.printResults();
        }
    }


// SIMULATION RESULTS
// ==================
// Dice: 2d6
// Trials: 1000000

//  sum | Count | Percentage | Bar Chart 
//  ----+-------+------------+---------- 
//    2 |  27886 |   2.79%  | *****
//    3 |  55737 |   5.57%  | ***********
//    4 |  83354 |   8.34%  | ****************
//    5 | 110942 |  11.09%  | **********************
//    6 | 139030 |  13.90%  | ***************************
//    7 | 166176 |  16.62%  | *********************************
//    8 | 138620 |  13.86%  | ***************************
//    9 | 111398 |  11.14%  | **********************
//   10 |  82781 |   8.28%  | ****************
//   11 |  56001 |   5.60%  | ***********
//   12 |  28075 |   2.81%  | *****
  
