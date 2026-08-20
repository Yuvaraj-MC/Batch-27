package Week2Program;

public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {

        // Find the last dot
        int index = filename.lastIndexOf('.');

        // If there is no dot
        if (index == -1) {
            return "Rejected - invalid file type";
        }

        // Get the extension
        String extension = filename.substring(index + 1);

        // Check accepted extensions
        if (extension.equalsIgnoreCase("pdf") ||
                extension.equalsIgnoreCase("docx") ||
                extension.equalsIgnoreCase("zip")) {

            return "Accepted";
        } else {
            return "Rejected - invalid file type";
        }
    }

    public static void main(String[] args) {



        System.out.println(validateFileExtension("Assignment1.PDF"));

        System.out.println(validateFileExtension("notes.txt"));

        System.out.println(validateFileExtension("Assignment"));


    }
}