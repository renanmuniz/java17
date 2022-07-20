package cap7.classesseladas;

public sealed class Carro permits Fusca {
    void ligar(){
        System.out.println("Ligando...");
    }

    void desligar(){
        System.out.println("Desligando...");
    }

    void acelerar(){
        System.out.println("Acelerando...");
    }

    void frear(){
        System.out.println("Freando...");
    }
}
