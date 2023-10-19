package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Hulk", "M", "N");
		lobo.emitirSom();
		
		Leao leao = new Leao("Zeca", "M", "N");
		leao.emitirSom();
		
		Gato gato = new Gato("Mingau", "M", "N");
		gato.emitirSom();
		
		Cachorro cachorro = new Cachorro("Apollo", "M", "N");
		cachorro.emitirSom();
		
		Tigre tigre = new Tigre("Baruk", "M", "N");
		tigre.emitirSom();
		
		
	}

}
