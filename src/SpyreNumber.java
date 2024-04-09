import java.util.Scanner;
class SpyreNumber {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int num = x.nextInt();
        int sum = 0, last = 0, product = 1;
        while (num > 0) {
            last = num % 10;
            sum += last;
            product *= last;
            num /= 10;
        }
        System.out.println((sum == product) ? "Spyre number" : " Not a Spyre number");

    }
}