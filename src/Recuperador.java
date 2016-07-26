
public class Recuperador {
	
	public int aguaVida(){
		int preço=10,upv=0;
		upv=personagem.pv*0.2;
		return upv;
	}
	
	public int hidromelVida(){
		int preço=35,upv=0;
		upv=personagem.pv*0.8;
		return upv;
	}
	
	public int aguaMagica(){
		int preço=10,upm=0;
		upm=personagem.pm*0.3;
		return upm;
	}

	public int hidromelMagica(){
		int preço=35,upm=0;
		upm=personagem.pm*1;
		return upm;
	}
}
