package Week2Program;

public class MaskPhoneNumber {

    public static String maskPhoneNumber(String phone) {

        // Check length
        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        // Check all characters are digits
        for (int i = 0; i < phone.length(); i++) {

            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Get last 4 digits
        String lastFour = phone.substring(6);

        // Create StringBuilder
        StringBuilder masked = new StringBuilder("XXXXXX");

        // Add last 4 digits
        masked.append(lastFour);

        // Insert '-' after XXXXXX
        masked.insert(6, "-");

        return masked.toString();
    }

    public static void main(String[] args) {

        System.out.println(maskPhoneNumber("9876543210"));

        System.out.println(maskPhoneNumber("98765"));

        System.out.println(maskPhoneNumber("9A76543210"));
    }
}