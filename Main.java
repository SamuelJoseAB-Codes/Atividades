import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        GestaoHospital gestaoHospital = new GestaoHospital();

		        boolean sair = false;
		        while (!sair) {
		            System.out.println("Selecione uma opção:");
		            System.out.println("1 - Adicionar paciente à fila");
		            System.out.println("2 - Atender próximo paciente");
		            System.out.println("3 - Exibir número de pacientes na fila");
		            System.out.println("4 - Sair");

		            int opcao = scanner.nextInt();
		            switch (opcao) {
		                case 1:
		                    gestaoHospital.adicionarPaciente();
		                    break;
		                case 2:
		                    gestaoHospital.atenderProximoPaciente();
		                    break;
		                case 3:
		                    gestaoHospital.exibirNumeroPacientesNaFila();
		                    break;
		                case 4:
		                    sair = true;
		                    break;
		                default:
		                    System.out.println("Opção inválida!");
		            }

		            System.out.println();
		        }
				scanner.close();
		    }
		}
        
