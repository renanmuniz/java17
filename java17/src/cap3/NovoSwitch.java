package cap3;

public class NovoSwitch {

    public static void main(String[] args) {
        int n;

        n = 1;

        //Switch antigo:
        switch (n) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Outro número");
                break;
        }
        // ----

        // Novo switch:
        switch (n) {
            case 1 -> System.out.println("Um");
            case 2 -> System.out.println("Dois");
            case 3 -> System.out.println("Três");
            default -> System.out.println("Outro número");
        }
        // ----


        var resultado = switch (n) {
            case 1 -> n + 10;
            case 2 -> n + 20;
            case 3 -> n + 30;
            default -> n;
        };

        System.out.println(resultado);

    }

}
