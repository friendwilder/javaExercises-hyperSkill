import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int myValue = scanner.nextInt();
        System.out.printf("%d", ((myValue + 1) * myValue + 2) * myValue + 3);
    }
}