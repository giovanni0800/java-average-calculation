package starting_java_on_linux;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double resultado = 0;
		
		do {
			System.out.print("\t-> Por favor, digite a nota 1 do(a) aluno(a) (Entre 0 e 10): ");
			nota1 = Double.valueOf( scan.next().replaceAll(",", ".") );
			
			System.out.print("\t-> Por favor, digite a nota 2 do(a) aluno(a) (Entre 0 e 10): ");
			nota2 = Double.valueOf( scan.next().replaceAll(",", ".") );
			
			if( nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 ) {
				System.out.print("\tValor digitado foi inválido... Por favor, atribuir notas entre 0 e 10!!!: ");
			}
			
		} while( nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10);
		
		if( ( (nota1 + nota2) / 2) < 6) {
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da atividade substitutiva").replaceAll(",", ".") );
			
			if(nota3 > nota1) {
				resultado = (nota2 + nota3) / 2;
			
			} else if (nota3 > nota2) {
				resultado = (nota1 + nota3) / 2;
				
			} else {
				resultado = (nota1 + nota2) / 2;
			}
		
		} else {
			resultado = (nota1 + nota2) / 2;
		}
		
		scan.close();
		
		System.out.println("\n\tA média do(a) aluno(a) é: " + resultado + "\n");
		
		if(resultado <= 5) {
			System.out.println("\t\u001B[36m<->\u001B[0m Status: " + "\u001B[31mALUNO REPROVADO");
		
		} else {
			System.out.println("\t\u001B[36m<->\u001B[0m Status: " + "\u001B[32mALUNO APROVADO");
		}
		
	}

}
