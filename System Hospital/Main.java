import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital(); // Instanciando o objeto hospital
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=======================================");
            System.out.println("          SISTEMA DO HOSPITAL          ");
            System.out.println("=======================================");
            
            System.out.println(" [1] - Gerar nova senha");
            System.out.println(" [2] - Chamar próximo paciente");
            System.out.println(" [3] - Mostrar fila de espera");
            System.out.println(" [4] - Mostrar histórico de chamadas");
            
            System.out.println("---------------------------------------");
            System.out.println(" [0] - Sair do sistema");
            System.out.println("=======================================");
            System.out.print(" -> Escolha uma opção: ");

            opcao = scanner.nextInt();
            
            System.out.println("\n---------------------------------------");

            switch (opcao) {
                case 1:
                    System.out.println(">>> OPÇÃO: Gerar nova senha");
                    hospital.gerarSenha();
                    break;
                case 2:
                    System.out.println(">>> OPÇÃO: Chamar próximo paciente");
                    hospital.chamarProximo();
                    break;
                case 3:
                    System.out.println(">>> OPÇÃO: Mostrar fila de espera");
                    hospital.mostrarFila();
                    break;
                case 4:
                    System.out.println(">>> OPÇÃO: Mostrar histórico");
                    hospital.mostrarHistorico();
                    break;
                case 0:
                    System.out.println(">>> Encerrando o sistema... Até logo!");
                    break;
                default:
                    System.out.println(">>> ERRO: Opção inválida! Tente novamente.");
            }
            
            if (opcao != 0) {
                System.out.println("---------------------------------------");
            }
        }

        scanner.close();
    }
}