import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        // I was trying to use trim, but it only removes trailing and head characters
        // firstLine = firstLine.trim();
        // It seems better to use firstLine.replaceAll() with regex information:
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html

        firstLine = firstLine.replaceAll("\\s+", "");
        secondLine = secondLine.replaceAll("\\s+", "");

        System.out.println(firstLine.equals(secondLine));
    }
}