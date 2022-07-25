package cap7.records;

public class TestRecord {

    public static void main(String[] args) {
        record Carro(String marca, int lugares){}

        Carro carro = new Carro("VW",5);
        System.out.println(carro.lugares());
        System.out.println(carro.marca());
        System.out.println(carro.toString());


        //Criando record com construtor customizado:
        record Caminhao(String marca, int capacidadeCarga) {
            public Caminhao(String marca, int capacidadeCarga) {
                if (capacidadeCarga < 0) throw new IllegalArgumentException();
                this.marca = marca;
                this.capacidadeCarga = capacidadeCarga;
            }
        }

//        Caminhao caminhao = new Caminhao("MB", -10_000); //Lança exceção!
//        System.out.println(caminhao);






        // Porem, pode-se criar o construtor sem declarar cada campo:
        //Criando record com construtor customizado:
        record Caminhao2(String marca, int capacidadeCarga) {
            public Caminhao2 {
                if (capacidadeCarga < 0) throw new IllegalArgumentException();
                marca = marca.toUpperCase();
            }
        }

//        Caminhao2 caminhao2 = new Caminhao2("scania", -10_000); //Lança exceção!

        Caminhao2 caminhao2Novo = new Caminhao2("volvo", 25_000);
        System.out.println(caminhao2Novo);


    }


}
