import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {

            alunos[i] = new Aluno();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = leitor.nextLine();

            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            alunos[i].idade = leitor.nextInt();

            leitor.nextLine();
        }

        System.out.println();
        System.out.println("----- Alunos Cadastrados -----");

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].apresentar();
        }

        leitor.close();
    }
}


// Classe Aluno
class Aluno {

    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------------");
    }
}