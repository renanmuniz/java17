package cap6;

public class TestGato extends Felino {
    @Override
    void comer() {
        System.out.println("Gato comendo...");
    }

    public static void main(String[] args) {
        TestGato teste = new TestGato();
        // Felino f = new Felino(); Classe abstrata nao pode ser instanciada.
        teste.comer();
    }
}
