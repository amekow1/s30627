import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        if(x>0){
            System.out.println("The number is positive");
        }else if(x<0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The value equals 0");
        }
        System.out.println();
        }
    }
