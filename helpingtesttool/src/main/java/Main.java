import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LogicMath logicMath = new LogicMath();
        boolean menu = true;
        System.out.println("CALCULATOR");
        System.out.println("-----------");
        while (menu == true){

            System.out.println("Options");
            System.out.println("1) Plus");
            System.out.println("2) Minus");
            System.out.println("3) Times");
            System.out.println("4) Divide");
            System.out.println("5) Power");
            System.out.println("6) Factorial");
            System.out.println("7) Exit");
            System.out.println("---------------");
            System.out.println("Choose:");
            int choice = sc.nextInt();
            if (choice == 1){
                System.out.println("--Plus--");
                System.out.println("First number");
                double in1 = sc.nextDouble();
                System.out.println("Second number");
                double in2 = sc.nextDouble();
                System.out.println("Output for Plus is:" + logicMath.plus(in1,in2));
            }
            if (choice == 2){
                System.out.println("--Minus--");
                System.out.println("First number");
                double in1 = sc.nextDouble();
                System.out.println("Second number");
                double in2 = sc.nextDouble();
                System.out.println("Output for Minus is:" + logicMath.minus(in1,in2));
            }
            if (choice == 3){
                System.out.println("--Times--");
                System.out.println("First number");
                double in1 = sc.nextDouble();
                System.out.println("Second number");
                double in2 = sc.nextDouble();
                System.out.println("Output for Times is :" + logicMath.times(in1,in2));
            }
            if (choice == 4){
                System.out.println("--Divide--");
                System.out.println("First number");
                double in1 = sc.nextDouble();
                System.out.println("Second number");
                double in2 = sc.nextDouble();
                System.out.println("Output for Divide is:" + logicMath.divide(in1,in2));
            }
            if (choice == 5){
                System.out.println("--Power--");
                System.out.println("First number");
                double in1 = sc.nextDouble();
                System.out.println("Second number");
                double in2 = sc.nextDouble();
                System.out.println("Output for Power is:" + logicMath.power(in1,in2));
            }
            if (choice == 6){
                System.out.println("--Factorial--");
                System.out.println("First number");
                int in1 = sc.nextInt();
                System.out.println("Your Factorial is:" + logicMath.factorial(in1));
            }
            if (choice == 7 ){
                menu = false;
            }






        }

    }

}
