import java.util.Scanner;

public class testAccount {

    public static void main(String[] args) {
        Scanner entre = new Scanner(System.in);

        //contas são inicializadas
        Account conta1 = new Account("Zé das Couves", 9.0) ;
        Account conta2 = new Account("Maria das Graças", -6.0);

        //exibe os saldos
        mostraConta(conta1);
        mostraConta(conta2);
        
        
        System.out.println("Digite o aporte para a conta1: ");
        double quantia = entre.nextDouble();
        conta1.deposito(quantia);

        System.out.println("Digite o aporte para a conta2: ");
        quantia = entre.nextDouble();
        conta2.deposito(quantia);

        mostraConta(conta1);
        mostraConta(conta2);        
        
    }
    public static void mostraConta(Account contaMostra){
        System.out.printf("%s balanço: R$%.2f %n",
            contaMostra.getNome(), contaMostra.getBal());
         }
    
}
