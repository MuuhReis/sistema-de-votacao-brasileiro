import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();

        if (anoNascimento > anoAtual) {
            System.out.println("\nAno de nascimento inválido!");
            input.close();
            return;
        }

        int idade = calcularIdade(anoAtual, anoNascimento);

        System.out.println("\n" + nome + ", você tem " + idade + " anos");

        String tipoVoto = verificarVoto(idade);

        System.out.println(tipoVoto);

        input.close();
    }

    // MÉTODOS

    public static int calcularIdade(int anoAtual, int anoNascimento) {
        return anoAtual - anoNascimento;
    }

    public static String verificarVoto(int idade) {

        if (idade < 16) {
            return "Voto não permitido";
        } 
        else if ((idade >= 16 && idade < 18) || idade > 70) {
            return "Voto opcional";
        } 
        else {
            return "Voto obrigatório";
        }
    }
}