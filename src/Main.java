import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String nome = entry.nextLine();

        System.out.print("Digite seu cpf:");
        float cpf = 0;
        try {
            cpf = Float.parseFloat(entry.nextLine());
        } catch (NumberFormatException e){
            System.out.print("ERROR:DIGITE APENAS NUMEROS");
            return;
        }

        System.out.print("Digite seu salario:");
        double salario = 0;
        try {
            salario = Double.parseDouble(entry.nextLine());
        } catch (NumberFormatException e){
            System.out.print("ERROR:DIGITE APENAS NUMEROS");
            return;
        }

        double novoSalario = 0;
        if (salario <= 1400){
            novoSalario = salario * 1.40;
            System.out.println("Atualização concluida");
        } else if (salario >= 1700) {
            novoSalario = salario * 1.20;
            System.out.println("Atualização concluida");
        } else {
            System.out.println("error");
        }

        System.out.println("Deseja exibir suas informações atualizadas? s/n" );
        String resposta = entry.nextLine();
        boolean s = false;

        if (resposta.equals("s")) {
            s = true;
        } else if (resposta.equals("n")) {
            s = false;
        } else {
            System.out.println("Entrada inválida. Digite s ou n.");
            return;
        }

        if (s){
            System.out.println("nome:" + nome);
            System.out.println("cpf:" + cpf);
            System.out.println("salario:" + novoSalario);
        } else {
            System.out.println("Sistema encerrado...");
        }


    }
}