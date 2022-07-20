package cap7.classesseladas;

public final class Fusca extends Carro {

    // Classes que herdam de classes seladas devem ser "final" para não permitirem futuras heranças.

    public static void main(String[] args) {
        Fusca fusca = new Fusca();
        fusca.ligar();  //Fusca ligando...
        fusca.acelerar();  //Fusca acelerando...
        fusca.frear(); //Fusca freando...
        fusca.desligar();  //Fusca desligando...
    }
}


