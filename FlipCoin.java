package Com.Demo;

import java.util.Random;

public class FlipCoin {



        public static void main(String[] args) {

            int totalFlips = 5; // Change this to the desired number of coin flips
            int headsCount = 0;
            int tailsCount = 0;

            if (totalFlips <= 0) {
                System.out.println("Please enter a positive integer for the number of coin flips.");
                return;
            }

            Random random = new Random();

            for (int i = 0; i < totalFlips; i++) {
                double randomValue = random.nextDouble(); // Generates a random value between 0 and 1

                if (randomValue < 0.5) {
                    tailsCount++;
                } else {
                    headsCount++;
                }
            }

            double headPercentage = (double) headsCount / totalFlips * 100;
            double tailPercentage = (double) tailsCount / totalFlips * 100;

            System.out.println("Number of coin flips: " + totalFlips);
            System.out.println("Heads: " + headsCount + " (" + headPercentage + "%)");
            System.out.println("Tails: " + tailsCount + " (" + tailPercentage + "%)");
        }

}
