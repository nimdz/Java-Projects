import java.sql.Connection;
import java.util.Scanner;

public class Patient {

    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection,Scanner scanner) {

        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatient(){

        System.out.print("Please Enter Patient Name:");
        String name=scanner.next();
        System.out.print("Please Enter Patient Age:");
        int age=scanner.nextInt();
        System.out.print("Please Enter Patient Gender:");
        String gender=scanner.next();

        try{


        }catch(SQLException e){


        }

    }
}

