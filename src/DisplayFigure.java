import java.util.Scanner;

public class DisplayFigure {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your select");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    if (i<4) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    } else {
                        for (int j = 1; (8-i) >= j; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Out of menu");
                break;
        }
    }
}
