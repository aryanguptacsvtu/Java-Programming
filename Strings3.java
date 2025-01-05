public class Strings3 {
    public static void main(String[] args) {

        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        String letter = "Dear <|name|> ,Thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);

        String str = "This string contains double and  triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        String s = "Dear Harry,\n\tThis JAVA Course is nice.\nThanks!";
        System.out.println(s);
    }
}
