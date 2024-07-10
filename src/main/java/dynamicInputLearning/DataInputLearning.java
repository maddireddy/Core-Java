package dynamicInputLearning;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputLearning {
    public static void main(String[] args) throws IOException {
        System.out.println("Inside");

        DataInputStream dataInputStream = new DataInputStream(System.in);
        int number = Integer.parseInt(dataInputStream.readLine());
        System.out.println(number);

        System.out.println("Read String");

        String myString = dataInputStream.readLine();
        System.out.println(myString);
    }
}
