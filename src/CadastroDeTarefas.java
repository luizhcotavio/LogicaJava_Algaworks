import java.util.Scanner;

public class CadastroDeTarefas {

	public static void main(String[] args) {
		
		//Usuario cadastra 5 tarefas mais imporntantes
		//armazenar em um vetor e imprimir no final 
		
		Scanner leia = new Scanner(System.in);
		
		String[] nomeTarefas = new String[5];
		
		int i=0;
		
		
		while(i < nomeTarefas.length) {
			
			System.out.print("Cadastre o nome da "+(i+1)+" tarefa:");
			nomeTarefas[i]= leia.next();
			i++;
		}
		i=0;
		System.out.println("\n");
		while (i < nomeTarefas.length) {
		System.out.println((i+1) + "� tarefa �:"+ nomeTarefas[i]);
		i++;
		}
		
		

	}

}
