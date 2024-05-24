import java.util.Stack;
import java.util.Scanner;

public class stackclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            s.push(data);
        }
        int sum = 0;

        while (!s.empty()) {
            sum += s.pop();
        }
        System.out.println(sum);
    }
}
