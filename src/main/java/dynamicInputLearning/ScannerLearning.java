package dynamicInputLearning;

import java.util.Scanner;

public class ScannerLearning {

    public static void main(String[] args) {
        try{

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name :: " );
            String name = scanner.next();
            System.out.println(name);

            System.out.println("Enter Number ");
            int number = scanner.nextInt();
            System.out.println(number);

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
