package fxmltableview.java.main;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static javax.swing.UIManager.get;

import fxmltableview.java.Person;

public class Records {
    public static String lastName;
    public static String firstName;
    public static String email;
    public static String status;

    public static void main(String[] args) throws IOException {

        Reader in = new FileReader("c:\\Users\\Dygy\\IdeaProjects\\fxmltableview1\\src\\file.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        System.out.println("here");
        List<Person> list;
        for (CSVRecord record : records) {
            String lastName = record.get(0);
            String firstName = record.get(1);
            String email = record.get(2);
            String status = record.get(3);
            Person p(record);
            list.add(p);

            System.out.println(lastName);
            System.out.println(firstName);
            System.out.println(email);
            System.out.println(status);
        }

    }

    public static String getEmail() {
        return email;
    }

    public static String getFirstname() {
        return firstName;

    }
    public static String getLastname() {
        return lastName;
    }
    public static String getStatus() {
        return status;
    }
}