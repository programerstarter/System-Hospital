import java.util.*;

public class Hospital {

    private Queue<Integer> fila;
    private List<Integer> historico;
    private int contador;

    public Hospital() {
        fila = new LinkedList<>();
        historico = new ArrayList<>();
        contador = 0;
    }

    public void gerarSenha() {
        contador++;
        fila.add(contador);
        System.out.println("Senha " + contador + " gerada.");
    }

    public void chamarProximo() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia. Nenhum paciente para chamar.");
            return;
        }

        int senha = fila.poll();
        historico.add(senha);
        System.out.println("Chamando senha: " + senha);
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila atual: " + fila);
        }
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum atendimento realizado.");
        } else {
            System.out.println("Histórico: " + historico);
        }
    }
}