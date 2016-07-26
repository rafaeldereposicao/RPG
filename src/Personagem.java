
public class Personagem {
	private String nome, descricao;
	private int nivel, cash, pe, pv, pm;
	Classe classe;
	
	public Personagem(){
		this.setNome(nome);
		this.setDescricao(descricao);
		this.nivel = 1;
		this.cash = 0;
	}
	
	//NOME----------------------------------------------------------------
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	//---------------------------------------------------------------------
	
	//DESCRICAO----------------------------------------------------------------
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	//---------------------------------------------------------------------
	
	//NIVEL----------------------------------------------------------------
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	
	public int getNivel(){
		return this.nivel;
	}
	//---------------------------------------------------------------------
	
	//MOEDA----------------------------------------------------------------
	public void setCassh(int cash){
		this.cash = cash;
	}

	public int getCash(){
		return this.cash;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE EXPERIÊNCIA----------------------------------------------------------------
	public void setPe(int pe){
		this.pe = pe;
	}
	
	public int getPe(){
		return pe;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE VIDA----------------------------------------------------------------
	public void setPv(int pv){
		this.pv = pv;
	}
	
	public int getPv(){
		return pv;
	}
	//---------------------------------------------------------------------
	
	//PONTO DE MANA----------------------------------------------------------------
	public void setPm(int pm){
		this.pm = pm;
	}
	
	public int getPm(){
		return pm;
	}
	//---------------------------------------------------------------------

}

