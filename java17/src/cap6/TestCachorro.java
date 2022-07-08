package cap6;

public class TestCachorro {
    //Polimorfismo:
    // Cria o metodo usando como parametro a classe pai, e ao ser invocado
    // com alguma classe filha, chama o metodo da classe filha
    public void fazerAnimalComer( Canino canino ) {
        canino.comer();
    }

    public static void main(String[] args) {
        TestCachorro t = new TestCachorro();
        // Polimorfismo:
        t.fazerAnimalComer( new Lobo() ); //Lobo comendo...
        t.fazerAnimalComer( new Cachorro() ); //Cachorro comendo...

        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.comer("Racao"); //overloaded
    }
}
