
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = Employee.parseCSV(columnMapping, fileName);

        String json = Employee.listToJson(list);

        Employee.writeString(json, "data.json");

        List<Employee> list2 = Employee.parseXML("data.xml");

        String json2 = Employee.listToJson(list2);

        Employee.writeString(json2, "data2.json");

    }
    
}
