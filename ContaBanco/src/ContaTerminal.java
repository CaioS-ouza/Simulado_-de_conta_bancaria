import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //neste caso usarei um número fixo de agência pois, é um único banco.
        
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja-bem vindo ao banco XXXX! \nDigite seu nome:");
        String nomeCliente=scanner.nextLine();

        //optei por transformar o número recebido em string para delimitar o número de dígitos de entrada.

        System.out.println("Agora, digite o numero da agência que deve ter exatamente 5 números: ");
        String numeroAgencia=scanner.nextLine();

        //lengh vai servir para limitar a quantidade de digitos, foi utilizado apenas como um teste.
        if (numeroAgencia.length()<5||numeroAgencia.length()>5) {
            System.out.println("valor inválido,tente escrever novamente");
            numeroAgencia=scanner.nextLine();
        }

        System.out.println("Agora, digite um número de 4 dígitos que será o número da sua conta: ");
        int numeroConta=scanner.nextInt();

        System.out.println("Agora, digite quanto você gostaria de depositar na conta: ");
        Float saldo=scanner.nextFloat();

        System.out.println("Olá ".concat(nomeCliente)+", obrigado por criar uma conta em nosso banco, sua agência é ".concat(numeroAgencia)+", conta"+numeroConta+" e seu saldo é de "+saldo+" , ele já está disponível para saque.");
        
    }
}
