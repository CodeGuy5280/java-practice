import java.util.Scanner;
import java.util.ArrayList;

public class TaskTracker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //USED TO RUN ALL CODE FROM OTHER CLASSES

        ArrayList<String> tasks= new ArrayList<>();

        boolean taskStart = true;

        System.out.println("Welcome! Choose a task option: ");

        while (taskStart) {
            System.out.println("1. View tasks: "); //all tasks menu
            System.out.println("2. Add tasks: "); //add tasks menu
            System.out.println("3. Delete tasks: "); //delete tasks menu
            System.out.println("4. Exit");

            int choice;

            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input, try again.");
                continue;
            }
            switch (choice){
                case 1:
                    System.out.println("View tasks: ");
                    break;
                case 2:
                    System.out.println("Add a task");
                    break;
                case 3:
                    System.out.println("Delete a task");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    taskStart = false;
                    break;
            }
        }
        scanner.close();
    }
}
