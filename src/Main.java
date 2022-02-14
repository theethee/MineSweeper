
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import com.javacourse.minesweeper.MineGenerator;

public class Main {

    static String input = "-";
    static String[] queue = { input , input , input , input , input ,
            input , input , input };

    public enum Command{
        f, //flaggning
        r, //röjning
        q,// quit
        unknown,
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Command command = parseCommand(input);
        parseCommand(input);

        while(true){
            String lista = Arrays.toString(queue);
            String lista2 = lista.replaceAll(","," ");
            lista2 = lista2.replaceFirst("]", " ");
            lista2 = lista2.replaceFirst("\\[", "|");
            System.out.println();
            System.out.println("   A B C D E F");
            System.out.println("   +-------------------");
            System.out.println("0 " + lista2);
            System.out.println("1 " + lista2);
            System.out.println( "> ");

            String userInput = scanner.nextLine();
        }

        /*Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println(randomInt);

        String[] coordinates = MineGenerator.sampleMineCoordinates(10, 15);
        String[] coordinates2 = MineGenerator.sampleMineCoordinates(10, 15, 1);
        String[] coordinates3 = MineGenerator.sampleMineCoordinates(10, 15, 1); // same seed as coordinates2
        System.out.println(java.util.Arrays.toString(coordinates));
        System.out.println(java.util.Arrays.toString(coordinates2));
        System.out.println(java.util.Arrays.toString(coordinates3)); // should be same as coordinates2

        String[]mineField =  {"-","-", "-", "-", "-", "-", "-", "-", "-", "-" };
        System.out.println(java.util.Arrays.toString(mineField) + java.util.Arrays.toString(coordinates));*/

        //TODO 1.börja med renderingen
        //printTemplate();
       //TODO 2 kommando f för flagga
        //TODO 3 kommando r för röjning
        //TODO 4 kommando q för quit
        //TODO 5 slumpgenerator


        //TODO kommandon:
        // f = flaggning
        // r = röjning
        // q = avsluta

        //TODO Gör en metod och anropa från main - för att kunna bryta i flera metoder



       /* //TODO Testa alla kommandon osv på denna!
        System.out.println(" A B C D");
        System.out.println("+----------");
        System.out.println("0| - - - -");
        System.out.println("1| - - - -");
        System.out.println("2| - - - -");
        System.out.println("3| - - - -");*/


    }
    private static Command parseCommand(String userInput){
        String commandQueue = userInput.split(" ")[0];
        switch(commandQueue){
            case "f":
                return Command.f;
            case "r":
                return Command.r;
            case "q":
                return Command.q;
            default:
                return Command.unknown;
        }
    }
        /*static void printTemplate() {

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

        }*/
    }











































