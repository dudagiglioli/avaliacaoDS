import java.util.Scanner;

public class principal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        classe pessoa = new classe();
        int opcao, i = 0;

        pessoa.primeiroNome = "Maria";
        pessoa.nomedoMeio = "Eduarda";
        pessoa.ultimoNome = "Giglioli Guilice";

        pessoa.agencia = "Banco do Brasil";

        pessoa.numero = 192902 ;

        pessoa.saldo = 1500;

        System.out.println("Titular --> " + pessoa.getNomeCompleto());
        System.out.println("Agência --> " + pessoa.getAgencia());
        System.out.println("Número --> " + pessoa.getNumero());
        System.out.println("Saldo --> " + pessoa.getSaldo());

        System.out.println("\n**********************OPÇÕES*************************");
        System.out.println("**********************1- Saque***********************");
        System.out.println("**********************2- Depósito********************");

        for (i = 1; i<= 3; i++){
            System.out.print("\nInforme a opção que deseja seguir: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Informe o valor que deseja sacar: ");
                pessoa.saque = sc.nextDouble();
                System.out.print("Valor atual: " + pessoa.getSaque());
            }

            else{
                System.out.print("Informe o valor que deseja depositar: ");
                pessoa.deposito = sc.nextDouble();
                System.out.print("Valor atual: " + pessoa.getDeposito());
            }

            System.out.println("\n");
            }
}
}
