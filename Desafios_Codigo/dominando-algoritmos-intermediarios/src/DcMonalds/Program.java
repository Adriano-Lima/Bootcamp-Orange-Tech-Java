package DcMonalds;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.nextLine();
        for (var ingrediente: ingredientes.split(";")) {
            System.out.println(ingrediente);
        }
        leitor.close();
    }
}
