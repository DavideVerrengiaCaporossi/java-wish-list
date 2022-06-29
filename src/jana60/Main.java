package jana60;

import java.util.ArrayList;


import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Consegna:
		//Creare una classe Main con metodo main in cui implementare il seguente programma:
		//Creare una lista dei desideri vuota e chiedere all’utente di aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
		//Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri sono contenuti nella lista in quel momento.
		//Al termine dell’inserimento stampare a video la lista ordinata.
		//…poi, visto che siamo buoni ma non buonissimi, possiamo anche mettere un limite a quanti desideri può inserire una persona 
		//creazione scanner
		Scanner scan = new Scanner(System.in);
		
		boolean flag = false;
		
		String conferma;
		ArrayList<String> Desideri = new ArrayList<String>(3);
		
		do {
			
			
			System.out.println("aggiungi un desiderio");
			
			Desideri.add(scan.nextLine());
			
			System.out.println("la lista dei tuoi desideri contiene " + Desideri);
			
			if(Desideri.size() == 3)
				System.out.println("mi spiace hai raggiunto il limite di desideri possibili");
				flag =true;
			
			do {
				
				System.out.println("vuoi aggiungere un altro desiderio ?");
				conferma = scan.nextLine();
				
				
				
			
			
			
		} while (!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
			if(conferma.equalsIgnoreCase("no"))
				flag = true;
		}while (!flag);
		
		for (int i = 0; i < Desideri.size(); i++) {
			System.out.println("Il desiderio numero " + (i + 1) + " è " + Desideri.get(i));
		}
		scan.close();
	}

}
