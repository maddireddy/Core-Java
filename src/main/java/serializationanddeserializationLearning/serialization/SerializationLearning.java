package serializationanddeserializationLearning.serialization;

import serializationanddeserializationLearning.SerializationUtil;

import java.io.IOException;

public class SerializationLearning {

    public static void main(String[] args) {
        String fileName = "employee.ser";

        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("Siva");
        emp.setSalary(5000);

        //serialize to file
        try {
            SerializationUtil.serialize(emp, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("emp Object::" + emp);
    }

}
