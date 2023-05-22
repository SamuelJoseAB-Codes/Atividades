import java.util.*;

class GestaoHospital {
    private Queue<Paciente> filaNormal;
    private Queue<Paciente> filaLeve;
    private Queue<Paciente> filaModerado;
    private Queue<Paciente> filaSevero;

    public GestaoHospital() {
        filaNormal = new LinkedList<>();
        filaLeve = new LinkedList<>();
        filaModerado = new LinkedList<>();
        filaSevero = new LinkedList<>();
    }

    public void adicionarPaciente() {
        Scanner okay = new Scanner(System.in);

        System.out.print("Nome do paciente: ");
        String nome = okay.nextLine();

        System.out.print("CPF do paciente: ");
        String cpf = okay.nextLine();

        System.out.println("Nível de prioridade: ");
        System.out.println("0 - normal");
        System.out.println("1 - leve");
        System.out.println("2 - moderado");
        System.out.println("3 - severo");
        int prioridade = okay.nextInt();

        Paciente paciente = new Paciente(nome, cpf, prioridade);
        switch (prioridade) {
            case 0:
                filaNormal.add(paciente);
                break;
            case 1:
                filaLeve.add(paciente);
                break;
            case 2:
                filaModerado.add(paciente);
                break;
            case 3:
                filaSevero.add(paciente);
                break;
            default:
                System.out.println("Prioridade inválida!");
        }

        System.out.println("Paciente adicionado à fila.");
        okay.close();
    }

    public void atenderProximoPaciente() {
        if (!filaSevero.isEmpty()) {
            atenderPaciente(filaSevero.poll());
        } else if (!filaModerado.isEmpty()) {
            atenderPaciente(filaModerado.poll());
        } else if (!filaLeve.isEmpty()) {
            atenderPaciente(filaLeve.poll());
        } else if (!filaNormal.isEmpty()) {
            atenderPaciente(filaNormal.poll());
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }

    private void atenderPaciente(Paciente paciente) {
        System.out.println("Atendendo paciente: " + paciente.getNome());
    }

    public void exibirNumeroPacientesNaFila() {
        System.out.println("Pacientes na fila:");
        System.out.println("Severo: " + filaSevero.size());
        System.out.println("Moderado: " + filaModerado.size());
        System.out.println("Leve: " + filaLeve.size());
        System.out.println("Normal: " + filaNormal.size());
    }
}
