package dynamicInputLearning;

public class CommandLineArguments {

    public static void main(String[] args) {
        System.out.println("Inside Main >>");

        if(args.length > 0){
            System.out.println(args[0]);
        }
    }
}
