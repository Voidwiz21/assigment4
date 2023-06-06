public class WeekFourAssignment {

    public static void main(String args[]) {
        String firstName = "abraham";
        String lastName = "lincoln";

        String primaryPhone = "555-123-1245";
        String secondaryPhone = "555.123.1246";

        // Call to methods that sanitize input.

        // Print results.

        System.out.println(sanitizeName(firstName,lastName));
        System.out.println(sanitizePN(primaryPhone, secondaryPhone));
    }

    //method to sanitize names

    //method to sanitize phone numbers


    public static String sanitizeName(String firstName, String lastName)
    {
        char firstChar = Character.toUpperCase(firstName.charAt(0));
        firstName = firstChar + firstName.substring(1);
        char lastChar = Character.toUpperCase(lastName.charAt(0));
        lastName = lastChar + lastName.substring(1);
        return firstName +" "+ lastName;

    }

    public static String sanitizePN(String primaryPhone, String secondaryPhone)
    {
        primaryPhone = primaryPhone.replaceAll("[^\\d]", "");
        secondaryPhone = secondaryPhone.replaceAll("[^\\d]", "");
        return primaryPhone + "\n" + secondaryPhone;
    }
}
/* originally I tried replacing the period and dashes by doing this ("-" + ".", "")
For some reason it wasn't working as intend, so I found a way  where ^\\d includes every non-digit character
which is then replaced with an empty string

 */