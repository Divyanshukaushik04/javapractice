import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the operator number ");
        int number = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int prod = a*b;
        int div = a/b;
        int mod = a%b;

        switch(number){
            case 1 : System.out.println(sum);
            break;
            case 2 : System.out.println(diff);
            break;
            case 3 : System.out.println(prod);
            break;
            case 4 : System.out.println(div);
            break;
            case 5 : System.out.println(mod);
            break;
            default : System.out.println("Invalid");
        }
    }
}