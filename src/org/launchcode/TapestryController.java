package org.launchcode;


import java.util.Scanner;

public class TapestryController {

    public static void main(String[] args) {
        //TapestryController tapestryController = new tapestryController();
        TapestryController.run();
    }

    private static void run() {
        //tapestryController();
        Scanner keyboard = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n");

            System.out.println("Which pattern do you want to test?");
            option = keyboard.nextInt();
            keyboard.skip("\n");
            System.out.println("Now running Pattern Maker test sequence.");
            if (option != 0) tapestryController(option);
        } while (option != 0);
        System.out.println("Test Ended. Good-bye");
    }

    public static void tapestryController(int option) {
        switch (option) {
            case 1:
                System.out.println("Now printing Pattern One: ");
                int r;
                int c;
                for (r = 0; r < 3; r++) {
                    for (c = 0; c < 8; c++) {
                        BaublePattern baublePattern = new BaublePattern();
                        baublePattern.patternMaker(); //lowercase @ beginning because it is the variable being called
                                                      //aka using an instance of the class
                        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern();
                        blockyBaublePattern.patternMaker();
                        CrossWigglePattern crossWigglePattern = new CrossWigglePattern();
                        crossWigglePattern.patternMaker();
                        ZigZagPattern zigZagPattern = new ZigZagPattern();
                        zigZagPattern.patternMaker();
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Now printing Pattern Two: ");
                int col;
                int row;
                for (row = 0; row < 8; row++) {
                    for (col = 0; col < 6; col++) {
                        BaublePattern baublePattern = new BaublePattern();
                        baublePattern.patternMaker(); //lowercase @ beginning because it is the variable being called
                                                      //aka using an instance of the class
                        BlockyBaublePattern blockyBaublePattern = new BlockyBaublePattern();
                        blockyBaublePattern.patternMaker();
                        CrossWigglePattern crossWigglePattern = new CrossWigglePattern();
                        crossWigglePattern.patternMaker();
                        ZigZagPattern zigZagPattern = new ZigZagPattern();
                        zigZagPattern.patternMaker();
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.print("Select a different option.");
        }
    }
}
        //Refer to just Patterns in here
            //1. for each pattern, print a band 8 pattern-blocks wide & 3 rows tall
            //2. leave a few blank lines.
            //3. for each pattern, print a band 6 pattern-blocks wide & 8 rows tall
        //use a loop/array to print all patterns, not individually


        //Patterns
            //xXxXxXxXxX  --> crossStitchWigglePattern
            //ZZZ===ZZZ===  --> ZigZagLinesPattern
            //--o--o--o--o--o  --> BaublePattern
            //[]--o--[]--o--[]--o--  --> BlockyBaublePattern

        //Optional Challenge: make patterns jam/fail w/a random # generator
        //... boolean needleJam = (Math.random() < 0.40d);

        //Data should be kept to local variables and private or protected variables,
        //not exposed as public
