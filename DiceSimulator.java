import java.util.Scanner;

public class DiceSimulator {

    public static int[] rollDice(int size) {
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 10; j++){
                sum += ((int)(Math.random() * 6.5)) + 1;
            }
            array[i] = sum;
            sum = 0;
        }
        return array;
    }

    public static void histogram(int array[]){

        for (int i = 10; 10 <= i && i <= 60; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    count++;
                }
            }

            System.out.print(i + ": ");

            for (int k = 0; k < count; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Create scanner object
        Scanner inp = new Scanner(System.in);

        // Greeting
        System.out.println("------------------------------------------\n" +
                "\tWelcome to dice simulator program!\n" +
                "------------------------------------------");

        // Prompt the user to enter a value
        System.out.print("Enter a value: ");
        int size = inp.nextInt();

        // Call methods
        histogram(rollDice(size));


    }
}
