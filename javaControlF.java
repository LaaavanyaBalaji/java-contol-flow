import java.util.Scanner;

public class javaControlF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("NIL");
                break;
        }
        for(int i=1;i<=num;i++)
        System.out.print(i);
        System.out.println();
        for(int i=num;i>=1;i--)
        System.out.print(i);
    }
}
