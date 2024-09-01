import java.util.ArrayList;
import java.util.Scanner;

public class FirstTask{
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static ArrayList<Integer> perfectNumbersTo(int n){
        ArrayList<Integer> numbers =  new ArrayList<Integer>();
        for(int i = 1; i < n; i++){
            if(isPerfectNumber(i))
                numbers.add(i);
        }
        return numbers;
    }

    public static void main(String[] args){
        System.out.println("Adjon meg egy egészszámot!");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("A szám %stökéletes szám", (isPerfectNumber(scanner.nextInt()) ? "" : "nem "));

        System.out.println("Adjon meg egy egészszámot!");
        perfectNumbersTo(scanner.nextInt()).forEach(n -> System.out.println(n));

        scanner.close();
    }
}