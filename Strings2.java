public class Strings2 {
    public static void main(String[] args) {

        String name = "Harry";

        System.out.println("Name : " + name);

        int value = name.length();
        System.out.println("Length of string : " + value);

        String lstring = name.toLowerCase();
        System.out.println("Lowercase String : " + lstring);

        String uString = name.toUpperCase();
        System.out.println("Uppercase String : " + uString);

        String nonTrimmedString = "      Harry    ";
        System.out.println("Trimmed String : " + nonTrimmedString.trim());

        System.out.println("\nSubstring : " + name.substring(2));
        System.out.println("Substring : " + name.substring(1, 5)); // [Start is included,End is Excluded]

        System.out.println("\nReplaced String : " + name.replace('r', 'p'));
        System.out.println("Replaced String : " + name.replace("rry", "ier"));
        System.out.println("Replaced String : " + name.replace("r", "ier"));

        System.out.println("\nStarts with : " + name.startsWith("ha"));
        System.out.println("Ends with : " + name.endsWith("rry"));

        System.out.println("\nChar at index 1 : " + name.charAt(1));
        System.out.println("Char at index 4 : " + name.charAt(4));

        String modifiedName = "Harryrry";
        System.out.println("Index of ry : " + name.indexOf("ry"));
        System.out.println("Index of r : " + name.indexOf("r"));
        System.out.println("Index of sad23 : " + name.indexOf("sad23"));
        System.out.println("Index of rry : " + modifiedName.indexOf("rry", 4));

        System.out.println("Last index of r : " + name.lastIndexOf('r'));
        System.out.println("Last index of ry : " + name.lastIndexOf("ry", 3));

        System.out.println("\nEquals : " + name.equals("harry"));
        System.out.println("Equals Ignore Case : " + name.equalsIgnoreCase("haRry"));

        System.out.println("\nUsing ESCAPE SEQUENCE Characters:");
        System.out.println("Hello! \"Using Double Quotes\"");
        System.out.println("Hello! \'Using Single Quotes\'");
    }
}
