import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.printf( "Укажите ваше имя: " );
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!\n" , name );
        }
    }
