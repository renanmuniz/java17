package cap6;

public class Cachorro extends Canino {

    @Override
    public void comer() {
        System.out.println("Cachorro comendo...");
    }

    //Overloading (sobrecarga) mesmo nome de metodo porem com parametros diferentes.
    public void comer(String oque) {
        System.out.println("Cachorro comendo " + oque);
    }
    public void latir() {
        System.out.println("Cachorro latindo...");
    }



}
