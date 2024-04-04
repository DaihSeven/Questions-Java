package src.exercicios;

import java.io.IOException;
import java.util.Scanner;

public class hotDogs {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
    
		int hotDogs = sc.nextInt();
		int participants = sc.nextInt(); 
    
		Double hotDogsPerParticipant = ((double)hotDogs)/participants;
    
		System.out.printf("%.2f", hotDogsPerParticipant);
	
		sc.close();
	}
}
