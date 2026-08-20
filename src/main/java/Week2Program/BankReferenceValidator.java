package Week2Program;

public class BankReferenceValidator {

    // Step 1: Normalize the reference
    public static String normalizeReference(String raw) {

        // Remove leading and trailing spaces
        String reference = raw.trim();

        // Convert only first 3 characters to uppercase
        if (reference.length() >= 3) {
            reference = reference.substring(0, 3).toUpperCase()
                    + reference.substring(3);
        }

        return reference;
    }

    // Step 2: Validate and format
    public static String validateAndFormat(String reference) {

        // Check length
        if (reference.length() != 14) {
            return "Invalid: wrong length";
        }

        // Check first 3 letters
        for (int i = 0; i < 3; i++) {

            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Check remaining 11 digits
        for (int i = 3; i < 14; i++) {

            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        // Extract values
        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9);

        // Format date
        String day = date.substring(0, 2);
        String month = date.substring(2, 4);
        String year = date.substring(4, 6);

        // Build output
        StringBuilder result = new StringBuilder();

        result.append("[")
                .append(bankCode)
                .append("] DATE: ")
                .append(day)
                .append("/")
                .append(month)
                .append("/")
                .append(year)
                .append(" | SEQ: ")
                .append(sequence);

        return result.toString();
    }

    public static void main(String[] args) {

        String input = " hdf03022600042 ";

        String normalized = normalizeReference(input);

        System.out.println(validateAndFormat(normalized));

        System.out.println(validateAndFormat("12F03022600042"));
    }
}
