package cap3;

import java.util.ArrayList;
import java.util.List;

public class ForEForEach {

    public static void main(String[] args) {
        List<String> cadastro = new ArrayList<>();
        cadastro.add("Renan");
        cadastro.add("Joao");
        cadastro.add("Jose");
        cadastro.add("Maria");

        testandoFor(cadastro);
        testandoForEach(cadastro);
    }

    static void testandoFor(List<String> cadastro) {
        System.out.println("Testando for convencional");
        System.out.println("Quantidade de itens em cadastro: " + cadastro.size());

        for(int i=0; i<cadastro.size(); i++) //lembrando que o indice comeca em zero e termina em n-1
        {
            System.out.println("Item do cadastro é: " + cadastro.get(i));
        }
        
        System.out.println("---\n");
    }

    static void testandoForEach(List<String> cadastro) {
        System.out.println("Testando foreach");
        System.out.println("Quantidade de itens em cadastro: " + cadastro.size());

        for(String s : cadastro) {
            System.out.println("Item do cadastro é: " + s);
        }

        System.out.println("---\n");
    }

}
