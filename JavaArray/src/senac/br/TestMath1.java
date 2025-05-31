package senac.br;

public class TestMath1 {
	
	
	
	public static void main(String[] args) {
		
		String[] nome = {"Roger", "Cleiton", "Reginaldo", "Renan"};
		
		int max = 10;
		int min = 1;
		int range = max - min +1;
		int rand;
		int escolhas = 0;
		
 		
		
		
		
		System.out.println("Modulo de -3 = " + Math.abs(-3));
		System.out.println("2 elevado ao cubo = " + Math.pow(2,3));
		System.out.println("Raiz quadrada de 25 = " + Math.sqrt(25));
		System.out.println("3.2 arredondado pra cima = " + Math.ceil(3.2));
		System.out.println("3.7 arredondado pra baixo = " + Math.floor(3.7));
		System.out.println("Gerar um numero aleatoria entre 0 e 1 = " + Math.random());
		System.out.println("Calcula um valor minimo entre 1 e 10 = " + Math.min(1, 10));
		System.out.println("Calcula um valor maximo entre 1 e 10 = " + Math.max(1, 10));
		
		
		for(int i = 0; i < 10; i++) {
			rand = (int)(Math.random() * range) + min;
		}
		
		for (int j = 0; j < 10; j++) {
		}
		
		
		
		
		escolhas = (int)(Math.random() * 40);
		System.out.println(escolhas);
			
		
	}
}
