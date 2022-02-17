package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Gato gato = new Gato("Peludo", "cinza", 2);
          //ctrl shft o para importar a classe gato
          //sysout + ctrl space dá o comando de imprimir
          System.out.println(gato);
          System.out.println(gato.getCor());
	}

}
