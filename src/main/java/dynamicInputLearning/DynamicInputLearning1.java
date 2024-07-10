package dynamicInputLearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicInputLearning1 {

    public static void main(String[] args){
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            System.out.println("Enter Text");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String input1 = bufferedReader.readLine();
            System.out.println(input1);

            System.out.println("enter next text");
            int number = bufferedReader.read();
            System.out.println(number);

        }catch (IOException exception){
            exception.printStackTrace();
        }

    }
}
