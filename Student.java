package studentdatabase;

import java.util.Scanner;

public class Student {

    private String primeiroNome;
    private String ultimoNome;
    private int nivelEnsino;
    private String estudanteID;
    private String cursos = "";
    private int mensalidade = 0;
    private static int custoCurso = 250;
    private static int id = 1001;

    // Construtor: propriedades: entrar com o nome e o ano do estudante
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro nome do estudante: \n");
        this.primeiroNome = in.nextLine();

        System.out.print("Digite o ultimo nome do estudante: \n");
        this.ultimoNome = in.nextLine();

        System.out.print("1 - Primeiro\n2 - Segundo\n3 - Terceiro\n4 - Quarto\nDigite o nivel de ensino do estudante: \n");
        this.nivelEnsino = in.nextInt();

        setStudentID();


    }


    // Gerar o ID único
    private void setStudentID() {
        // nível de ensino + ID
        id++;
        this.estudanteID = nivelEnsino + "" + id;


    }


    // Registrar em cursos
    public void registrar() {
        // Entrar em um laço que termina quando usuário digita S;

        do {
            System.out.print("Digite o curso para se matricular (S para sair): ");
            Scanner in = new Scanner(System.in);
            String curso = in.nextLine();
            if (!curso.equals("S")) {
                cursos = cursos + "\n " + curso;
                mensalidade = mensalidade + custoCurso;
            } else {
                break;
            }

        } while (1 != 0);
    }


    // Ver saldo
    public void verSaldo() {
        System.out.println("Seu saldo é:  R$ " + mensalidade);

    }

    // Pagar mensalidade
    public void pagarMensalidade() {
        System.out.println("R$ " + mensalidade);
        System.out.println("Digite seu pagamento:  ");
        Scanner in = new Scanner(System.in);
        int pagamento = in.nextInt();
        mensalidade = mensalidade - pagamento;
        System.out.println("Pagamento feito com sucesso.");
        verSaldo();
    }

    // Mostrar Status
    public String mostrarInfo() {
        return "Nome: " + primeiroNome + " " + ultimoNome +
                "\nNivel Ensino: " + nivelEnsino +
                "\nID: " + estudanteID +
                "\nCursos registrados: " + cursos +
                "\nSaldo: R$ " + mensalidade +
                "\n--------------------------";

    }

}
