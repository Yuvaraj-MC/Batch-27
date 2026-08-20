package Week2Program;

public class StudentRecordParser {

    public static void parseStudentRecord(String csvLine) {

        // Split the string using comma
        String[] data = csvLine.split(",");

        // Check if exactly 3 fields are present
        if (data.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        // Store values in variables
        String name = data[0];
        String rollNo = data[1];
        String department = data[2];

        // Print formatted output
        System.out.println("Name: " + name +
                " | Roll No: " + rollNo +
                " | Dept: " + department);
    }

    public static void main(String[] args) {

        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");

        parseStudentRecord("Ananya Verma,CSE");
    }
}