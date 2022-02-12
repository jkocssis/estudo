import java.util.Scanner;

public class testAccount {

    public static void main(String[] args) {
        Account conta1 = new Account("Zé das Couver") ;
        Account conta2 = new Account("Maria das Graças");

        System.out.printf("conta 1 é: %s%n",
            conta1.getNome());
        System.out.printf("conta 1 é: %s%n",
            conta2.getNome());
    }
    
}
