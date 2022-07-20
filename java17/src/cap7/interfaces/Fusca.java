package cap7.interfaces;

public class Fusca implements Carro{
    @Override
    public void ligar() {
        System.out.println("Fusca ligando...");
    }

    @Override
    public void acelerar() {
        System.out.println("Fusca acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Fusca freando...");
    }

    @Override
    public void desligar() {
        System.out.println("Fusca desligando...");
    }

    public static void main(String[] args) {
        Fusca fusca = new Fusca();
        fusca.ligar();  //Fusca ligando...
        fusca.acelerar();  //Fusca acelerando...
        fusca.frear(); //Fusca freando...
        fusca.desligar();  //Fusca desligando...
    }
}


