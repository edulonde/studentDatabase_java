package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args){


        // Perguntar quantos novos estudantes nós queremos adicionar
        System.out.println("Digite número de estudoantes ingressos: ");
        Scanner in = new Scanner(System.in);
        int numDeEstudantes = in.nextInt();
        Student[] students = new Student[numDeEstudantes];


        // Criar n números de novos estudantes

        for (int n = 0; n < numDeEstudantes; n++) {
            students[n] = new Student();
            students[n].registrar();
            students[n].pagarMensalidade();
            
        }
        for (int n = 0; n < numDeEstudantes; n++) {
            System.out.println(students[n].mostrarInfo());
        }



    }
}
