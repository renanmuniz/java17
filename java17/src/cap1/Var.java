package cap1;

public class Var {

    //var nome = "Renan"; //var só pode ser declarado em variáveis locais.


    public static void main(String[] args) {
        var nome = "Renan";
        System.out.println(nome.getClass());  //class java.lang.String

        var soma = somaInteiros(2,3);
        System.out.println(soma.getClass());  //class java.lang.Integer
        System.out.println(soma);  // 5

        //nome = 123; // uma vez definido o tipo de uma variavel var, ela nao muda.
    }

    static Integer somaInteiros(Integer n1, Integer n2) {
        var soma = n1 + n2;
        return soma;
    }
}
