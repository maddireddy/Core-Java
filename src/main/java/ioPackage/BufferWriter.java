package ioPackage;

import java.io.*;

public class BufferWriter {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Notes_Buffer.txt");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello").append("~").append("Bye");

        fileOutputStream.write(stringBuffer.toString().getBytes());

        File file = new File("//MyLearning");
    }
}
