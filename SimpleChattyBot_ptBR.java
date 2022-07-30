import java.util.Scanner;

public class SimpleChattyBot {
    final static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        BoasVindas("Assistente", "2022"); // Mude como quiser
        RelembreSeuNome();
        AdvinheAIdade();
        contagem();
        prova();
        fim();
    }

    static void BoasVindas(String assistente, String AnoDeCriacao) {
        System.out.println("Olá eu sou o robô " + assistente + ".");
        System.out.println("Eu fui criado em " + AnoDeCriacao + ".");
        System.out.println("Por favor, relembre seu nome.");
    }

    static void RelembreSeuNome() {
        String nome = scanner.nextLine();
        System.out.println("Que nome legal você tem, " + nome + "!");
    }

    static void AdvinheAIdade() {
        System.out.println("Deixe-me adivinhar sua idade.");
        System.out.println("Insira os restos da divisão de sua idade por 3, 5 e 7.");
        int resto3 = scanner.nextInt();
        int resto5 = scanner.nextInt();
        int resto7 = scanner.nextInt();
        int idade = (resto3 * 70 + resto5 * 21 + resto7 * 15) % 105;
        System.out.println("Sua idade é " + idade + "; essa é uma boa hora para começar a programar!");
    }

    static void contagem() {
        System.out.println("Agora vou provar a você que posso contar até o número que você quiser.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void prova() {
        System.out.println("Vamos testar seus conhecimentos de programação.");
        System.out.println("1. Para repetir uma declaração várias vezes.");
        System.out.println("2. Decompor um programa em várias pequenas sub-rotinas.");
        System.out.println("3. Determinar o tempo de execução de um programa.");
        System.out.println("4. Para interromper a execução de um programa.");

        int resposta = scanner.nextInt();
        for(;resposta != 2;){
            System.out.println("Tente denovo ;-;");
            resposta = scanner.nextInt();
            }
    }
    static void fim() {
        System.out.println("Parabéns, tenha um bom dia!\nNever Stop to learning!"); 
        }
}
