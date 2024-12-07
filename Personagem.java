package Personagem;

public class Personagem {  
    // Atributos  
    private String nome;  
    private int vida;  
    private int ataque;  
    private int defesa;  

    // Construtor  
    public Personagem(String nome, int vida, int ataque, int defesa) {  
        this.nome = nome;  
        this.vida = vida;  
        this.ataque = ataque;  
        this.defesa = defesa;  
    }  

    // Getters  
    public String getNome() {  
        return nome;  
    }  

    public int getVida() {  
        return vida;  
    }  

    public int getAtaque() {  
        return ataque;  
    }  

    public int getDefesa() {  
        return defesa;  
    }
    
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
  
    // Método atacar  
    public void atacar(Personagem outroPersonagem) {  
        System.out.println(this.nome + " ataca " + outroPersonagem.getNome() + "!");  
        int dano = Math.max(0, this.ataque - outroPersonagem.getDefesa());  
        outroPersonagem.sofrerDano(dano);  
    }  

    // Método sofrer dano  
    public void sofrerDano(int dano) {  
        this.vida -= dano;  
        if (this.vida <= 0) {  
            this.vida = 0;  
            System.out.println(this.nome + " foi derrotado!");  
        } else {  
            System.out.println(this.nome + " recebeu " + dano + " de dano. Vida restante: " + this.vida);  
        }  
    }  
}    
