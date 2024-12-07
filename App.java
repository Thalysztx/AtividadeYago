import Personagem.*;

public class App {  
    public static void main(String[] args) {  
        // Criando dois personagens para teste  
        Personagem guerreiro = new Personagem("Guerreiro", 100, 20, 10);  
        Personagem mago = new Personagem("Mago", 80, 25, 5);  

        // Testando o combate  
        guerreiro.atacar(mago);  
        mago.atacar(guerreiro);  
    }  
}  