package notebookExample;

import asg.cliche.Command;

import java.util.ArrayList;

/**
 * Created by alekgurg on 09.05.2017.
 * bla bla bla
 */
public class Notebook {

    ArrayList<Record> records = new ArrayList<>();

    @Command
    public ArrayList<Record> list() {
        return records;
    }

//    @Override
//    public String toString() {
//        return "Notebook{" +
//                "records=" + records +
//                '}';
//    }

    @Command
    public Record createPerson(String firstName, String lastName, String address, String eMail, String... phone) {
        Person result = new Person();
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setPhone(phone);
        result.setAddress(address);
        result.seteMail(eMail);
        records.add(result);
        return result;
    }


}