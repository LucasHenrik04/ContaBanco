import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Sejá bem vindo ao Banco, você deseja ter um cadastro ?");
        System.out.println("responda com sim ou não: ");
        String resposta = scanner.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Ótimo! Vou te fazer algumas perguntas e você irá me passando as informações");
        } else {
            System.out.println("Obrigado por visitar nosso banco!");
        }
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de agência desejado: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da sua conta desejado: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo que você terá no banco: ");
        double saldo = scanner.nextDouble();

        System.out.println(nome + " Seu cadastro foi concluído com sucesso! Sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo disponível para saque é R$" + saldo);
    }
}
