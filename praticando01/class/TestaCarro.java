public class TestaCarro{
    public static void main(String args[]){

    Carro meuCarro = new Carro();

    meuCarro.cor = "Preto";
    meuCarro.modelo = "Fuscão";
    meuCarro.velocidadeAtual = 0;
    meuCarro.velocidadeMaxima = 60;

    meuCarro.liga();

    meuCarro.acelera(25);    
   
    Carro carroDoNeymar = new Carro();

    carroDoNeymar.cor = "Preto";
    carroDoNeymar.modelo = "Fuscão";
    carroDoNeymar.velocidadeAtual = 0;
    carroDoNeymar.velocidadeMaxima = 60;

    carroDoNeymar.liga();

    carroDoNeymar.acelera(250);
    
    System.out.println("Velocidade do meu carro " + meuCarro.velocidadeAtual);
    System.out.println("Velocidade carro Neymar " + carroDoNeymar.velocidadeAtual);
  
    
    }
}
    