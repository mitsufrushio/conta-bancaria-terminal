import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta: ");
        Integer numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, informe a Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe o nome do Cliente: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, informe o saldo da Conta: ");
        BigDecimal saldo = sc.nextBigDecimal();

        String saida = "Olá ".concat(nome).concat(", obrigado por criar um conta em nosso banco, sua agência é ")
                        .concat(agencia).concat(", conta ").concat(numero.toString()).concat(" e seu saldo ").concat(saldo.toString())
                        .concat(" já está disponível para saque.");
        System.out.println(saida);
        sc.close();        
    }
}
