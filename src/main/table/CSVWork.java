package table;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVPrinter;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class CSVWork
{
    FXMLTableViewController data;
    public ArrayList<Person> parseCSV() throws IOException {
        String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);

        Reader in = new FileReader("src/main/file.csv");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        System.out.println("here");
        ArrayList<Person> list = new ArrayList<Person>();
        for (CSVRecord record : records) {
            String lastName = record.get(0);
            String firstName = record.get(1);
            String email = record.get(2);
            String status = record.get(3);
            Person p = new Person(record);
            list.add(p);

            System.out.println(lastName);
            System.out.println(firstName);
            System.out.println(email);
            System.out.println(status);
        }

        return list;
    }
    /*private static final String CSV_FILE = "src/main/file.csv";
    public void writeCSV(List<Person> p) throws IOException {
        try (
                     BufferedWriter writer = Files.newBufferedWriter(Paths.get(CSV_FILE));

                     CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                             .withHeader("FirstName", "LastName", "Email", "Status"));
        ) {
        csvPrinter.printRecord(Arrays.asList("", "", "", ""));

        csvPrinter.flush();
    }}
 */
}

