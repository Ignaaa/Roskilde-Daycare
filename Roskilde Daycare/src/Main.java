import java.util.*;
import java.io.*;

public class Main {

    /*
    public static ArrayList<Employee> EmpList= new ArrayList<Employee>();
    public static ArrayList<Child> ChildListActive= new ArrayList<Child>();
    public static ArrayList<Child> ChildListWaiting= new ArrayList<Child>();
    */

    public static void main(String[] args) {

    }

    public static void mainMenu() {
        boolean run = true;
        System.out.println("WELCOME TO ROSKILDE DAYCARE IT SYSTEM");
        System.out.println("Please, select one of the following options:");
        System.out.println("Press 1 to View Schedule");
        System.out.println("Press 2 to View Children's Data");
        System.out.println("Press 3 to Access as Administrator");
        System.out.println("Press 0 to Save and Exit");
        Scanner console = new Scanner(System.in);
        int option = console.nextInt();
        switch (option) {
            case 1: ...;
                break;
            pressEnter();
            case 2: ...;
                pressEnter();
                break;
            case 3:
                AdministratorMenu();
                pressEnter();
                break;
            case 0:
                run = false;
                System.out.println("Goodbye! Have a nice day!");
                pressEnter();
                break;
            default:
                System.out.println("You need to select one of these options");
        }

    }

    public static void pressEnter() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, press 'Enter' to exit");
        console.next();
    }

    public static void EmployeeMenu() {
        boolean run = true;
        System.out.println("WELCOME TO THE EMPLOYEE'S DATA MENU");
        System.out.println("Please, select one of the following options:");
        System.out.println("Press 1 to ....");
        System.out.println("Press 2 to ....");
    }

    public static void ChildrenMenu() {
        boolean run = true;
        System.out.println("WELCOME TO THE CHILDREN'S DATA MENU");
        System.out.println("Please, select one of the following options:");
        System.out.println("Press 1 to ....");
        System.out.println("Press 2 to ....");

    }

    public static void AdministratorMenu() {
        boolean run = true;
        System.out.println("WELCOME TO THE ADMINISTRATOR MENU");
    }


    public static void pressEnter() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, press 'Enter' to exit");
        console.next();
    }

    //LOAD: lee File
    public static ArrayList<Object> fileReader(String fileName) {
        Scanner reader = new Scanner(new File(fileName));
        while (reader.hasNext()) {
            String line = reader.nextLine();
            Scanner lineReader = new Scanner(String line);
            while (lineReader.hasNext()) {
                String word = lineReader.next();
            }
        }

    }

    //SAVE
    public static void save() {

    }


    public static void showActiveList() {

    }

    public static void createEmployee(ArrayList<Child> activeList) {
        Employee e1 = new Employee();
        activeList.add(e1);
    }

    public static void deleteEmployee(ArrayList<Child> activeList, ArrayList<Child> waitingList, Employee e) {
        activeList.remove(e);
        waitingList.add(e);
    }
}
