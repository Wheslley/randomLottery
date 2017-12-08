package sorteio;

import java.util.Random;

public class RandomSorteio {

	private Integer numeroParticipantes;

	public String nomes[] = { "Abacaxi", "Pera", "Maça", "Banana" };

	public String getNome(Integer index) {
		return this.nomes[index];
	}

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}

	public RandomSorteio(Integer numero) {
		this.numeroParticipantes = numero;
	}

	public Integer getNumeroParticipantes() {
		return numeroParticipantes;
	}

	public void setNumeroParticipantes(Integer numeroParticipantes) {
		this.numeroParticipantes = numeroParticipantes;
	}

	public Integer[] amigoSecreto() {

		Integer amigoSecreto[] = new Integer[numeroParticipantes];

		boolean fim = true, numeroIgual = true;
		Integer numero = 0, contadorVetor = 0;
		Random gerador = new Random();

		for (int a = 0; a < this.numeroParticipantes; a++) {
			amigoSecreto[a] = -1;
		}

		while (fim) {
			numero = gerador.nextInt(this.numeroParticipantes);
			for (int a = 0; a < this.numeroParticipantes; a++) {
				if (amigoSecreto[a] == numero) {
					numeroIgual = true;
				}
			}
			if (!numeroIgual) {
				amigoSecreto[contadorVetor] = numero;
				contadorVetor++;
			}
			numeroIgual = false;
			if (contadorVetor == this.numeroParticipantes)
				fim = false;
		}

		return amigoSecreto;

	}

	public Integer[] inimigoSecreto() {

		Integer inimigoSecreto[] = new Integer[numeroParticipantes];

		boolean fim = true, numeroIgual = true;
		Integer numero = 0, contadorVetor = 0;
		Random gerador = new Random();

		for (int a = 0; a < this.numeroParticipantes; a++) {
			inimigoSecreto[a] = -1;
		}

		while (fim) {
			numero = gerador.nextInt(this.numeroParticipantes);
			for (int a = 0; a < this.numeroParticipantes; a++) {
				if (inimigoSecreto[a] == numero) {
					numeroIgual = true;
				}
			}
			if (!numeroIgual) {
				inimigoSecreto[contadorVetor] = numero;
				contadorVetor++;
			}
			numeroIgual = false;
			if (contadorVetor == this.numeroParticipantes)
				fim = false;
		}

		return inimigoSecreto;

	}

}
