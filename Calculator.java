import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       
       while(true){
        System.out.print("Enter the operator:");
        char op=in.next().trim().charAt(0);
        System.out.println();
        if(op=='x' || op=='X'){
            break;
        }
        if(op=='+' || op== '-' || op=='*' || op=='%' || op=='/'){
            System.out.print("Enter 2 numbers: ");
            int num1 =in.nextInt();
            int num2=in.nextInt();
            System.out.println();
            if (op=='+'){
                System.out.println(num1 + num2);
            }
            else if(op=='-'){
                System.out.println(num1-num2);
            }
            else if(op=='*'){
                System.out.println(num1*num2);
            
            }
            else if (op=='/'){
                if(num2 !=0){
                    System.out.println(num1/num2);
                }else{
                    System.out.println("Undefined");
                }  
            }
            else if(op=='%'){
                if(num2 !=0){
                    System.out.println(num1%num2);
                }else{
                    System.out.println("Undefined");
                }  
            }        
        }
        else{
            System.out.println("Invalid operation");
            }        
        }
       }
    }

