
import java.util.Random;
import java.util.Scanner;
import com.javacourse.minesweeper.MineGenerator;

public class Main {



    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello World");


        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println(randomInt);

        String[] coordinates = MineGenerator.sampleMineCoordinates(10, 15);
        String[] coordinates2 = MineGenerator.sampleMineCoordinates(10, 15, 1);
        String[] coordinates3 = MineGenerator.sampleMineCoordinates(10, 15, 1); // same seed as coordinates2
        System.out.println(java.util.Arrays.toString(coordinates));
        System.out.println(java.util.Arrays.toString(coordinates2));
        System.out.println(java.util.Arrays.toString(coordinates3)); // should be same as coordinates2

        //TODO 1.börja med renderingen
       printTemplate();
       //TODO 2 kommando f för flagga
        //TODO 3 kommando r för röjning
        //TODO 4 kommando q för quit
        //TODO 5 slumpgenerator


        //TODO kommandon:
        // f = flaggning
        // r = röjning
        // q = avsluta

        //TODO Gör en metod och anropa från main - för att kunna bryta i flera metoder

    }
        static void printTemplate() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("  A B C D E F G H I J");
            System.out.println(" +---------------------");
            System.out.println("0| - - - - - - - - - -");
            System.out.println("1| - - - - - - - - - -");
            System.out.println("2| - - - - - - - - - -");
            System.out.println("3| - - - - - - - - - -");
            System.out.println("4| - - - - - - - - - -");
            System.out.println("5| - - - - - - - - - -");
            System.out.println("6| - - - - - - - - - -");
            System.out.println("7| - - - - - - - - - -");
            System.out.println("8| - - - - - - - - - -");
            System.out.println("9| - - - - - - - - - -");
            System.out.println(">");
            String input = scanner.nextLine();
        }
        static void prompt(){

        }
    }











































