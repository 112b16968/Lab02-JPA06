import java.util.Scanner;

public class Lab02JPA06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i =0 ; i < 4; i++){
            System.out.printf("Input Chiese score:");
            int number1 = input.nextInt();
            System.out.printf("Input English score:");
            int number2 = input.nextInt();
            System.out.printf("Input Math score:");
            int number3 = input.nextInt();
            boolean result1 = number1 >= 60;
            boolean result2 = number2 >= 60;
            boolean result3 = number3 >= 60;
            if (result1 != true) {
                System.out.println("Chinese faiiled.");
            }
            if (result2 != true) {
                System.out.println("English faiiled.");
            }
            if (result3 != true) {
                System.out.println("Math faiiled.");
            }
            if (result1 && result2 && result3 == true) {
                System.out.println("All pass.");
            }

        }
        input.close();
    }
}
