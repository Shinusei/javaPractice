package Practice20.task1;

import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.exit;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Stack<Double> stack = new Stack<>();
        System.out.println("Input RPN:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] elem = str.split(" ");
        for(int i =0;i< elem.length;i++){
            Double a = 0.0;
            Double b = 0.0;
            switch (elem[i]){
                case "+":
                    try {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b+a);
                    } catch (Exception e){
                        System.out.println("Wrong input");
                        exit(1);
                    }
                    break;
                case "-":
                    try {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b-a);
                    } catch (Exception e){
                        System.out.println("Wrong input");
                        exit(1);
                    }
                    break;
                case "*":
                    try {
                        a = stack.pop();
                        b = stack.pop();
                        stack.push(b*a);
                    } catch (Exception e){
                        System.out.println("Wrong input");
                        exit(1);
                    }
                    break;
                case "/":
                    try {
                        a = stack.pop();
                        b = stack.pop();
                        if (a != 0)
                            stack.push(b / a);
                        else {
                            throw new Exception("Divide by 0");
                        }
                    }catch (Exception e){
                        System.out.println("Wrong input");
                        exit(1);
                    }
                    break;
                default:
                    stack.push(Double.parseDouble(elem[i]));
            }
        }
        try {
            System.out.println(stack.pop());
        }catch (Exception e){
            System.out.println("Wrong input");
            exit(1);
        }
    }

}
