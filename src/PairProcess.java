import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        average = sum / 2;

        if(sum > 1000){
            System.out.println("Sum: " + sum + "~");
        }
        else if(sum > 200){
            System.out.println("Sum: " + sum + "*");
        }
        else {
            System.out.println("Sum: " + sum);
        }
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
    }

}