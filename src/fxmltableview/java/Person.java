package fxmltableview.java;
import fxmltableview.java.main.Records;

import org.apache.commons.csv.CSVRecord;

public class Person {
    /*
    Records records;
    String firstName = records.getFirstname();
    String lastName = records.getLastname();
    String   email = records.getEmail();
    String status = records.getStatus();


    public Person(String firstName, String lastName, String email,String status) {

        public Person(String firstName, String lastName , String email, String status); {
            this(" ", " ", " "," ");

     }
   }*/

    String firstName;
    String lastName;

    public Person(CSVRecord csvRecord) {
        firstName = csvRecord.get(0);
        //....
    }

    public Person(String _firstName, String _lastName) {
        firstName = _firstName;
        lastName = _lastName;
    }
}

//Records records;
//        String firstName = records.getFirstname();
//        Records records;
//        String lastName = records.getLastname();
//        Records records;
//        String   email = records.getEmail();
//        Records records;
//        String status = records.getStatus();
//        public Person(String , String , String email, String status) {
//            this(" ", " ", " "," ");
//        }
//public Person() {
//        this(" ", " ", " "," ");
//    }