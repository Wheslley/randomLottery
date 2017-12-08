package sorteio;

public class Sorteio {

	public static void main(String[] args) {
		
		Integer numeroParticipantes = 4;
		RandomSorteio rs = new RandomSorteio(numeroParticipantes);
		
		Integer amigoSecreto[] = rs.amigoSecreto();
		Integer inimigoSecreto[] = rs.inimigoSecreto();
		
		System.out.println("------------------------------------------------------------------------------");
		for(int x=0; x<numeroParticipantes; x++) {
			System.out.println("------------------------------------------------------------------------------");
			System.out.println("\nNOME: " + rs.getNome(x) + "\n");
			
			System.out.println("\nAMIGO SECRETO: " + rs.getNome(amigoSecreto[x]));
			System.out.println("VALOR MÍNIMO: R$ 20,00\n");
			
			System.out.println("\nINIMIGO SECRETO: " + rs.getNome(inimigoSecreto[x]));
			System.out.println("VALOR MÍNIMO: R$ 1,99\n");
						
			System.out.println("------------------------------------------------------------------------------");			
		}
		System.out.println("------------------------------------------------------------------------------");
	}

}
