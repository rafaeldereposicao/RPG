
public class Item {
	private String nome, tipo,descricaoEfeito;
	private float efeito,preco,tempoDescanso;
	
	
	
	//-------------------------------AGILIDADE--------------------------------
		public void setNome(String nome){	
			this.nome = nome;
		}
		
		public String getNome(){
			return this.nome;
		}
		//--------------------------------FIM---------------------------------
			
		//--------------------------------FORCA---------------------------
		public void setTipo(String tipo){	
			if(tipo != "Recuperador" && tipo != "Modificador"){
				this.tipo = tipo;
			}else{
				this.tipo = "Recuperador";
			}
		}
		
		public String getTipo(){
			return this.tipo;
		}
		//--------------------------------FIM---------------------------------
		
		//--------------------------------INTELIGENCIA---------------------------
		public void setDescricaoEfeito(float magia){	
			t
			
			
			his.descricaoEfeito = descricaoEfeito;
		}
		
		public float getMagia(){
			return this.descricaoEfeito;
		}
		//--------------------------------FIM---------------------------------
		
		//-----------------------NOME DA HABILIDADE--------------------------
		public void setNomeHabilidade(String nomeHabilidade ){	
			this.nomeHabilidade = nomeHabilidade;
		}
		
		public String getNomeHabilidade(){
			return this.nomeHabilidade;
		}
		//--------------------------------FIM---------------------------------
		
		//--------------------------------DANO--------------------------------
		public void setDano(float dano ){	
			this.dano = dano;
		}
		
		public float getDano(){
			return this.dano;
		}
		//--------------------------------FIM---------------------------------
		
		//--------------------------------ALVO--------------------------------
		public void setAlvo(float alvo ){	
			this.alvo = alvo;
		}
		
		public float getAlvo(){
			return this.dano;
		}
		//--------------------------------FIM---------------------------------
		
	
	
	
	
	
	
}
