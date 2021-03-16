package m3;
import java.util.Scanner;
import java.util.Arrays;

class Nivell1 {
    public static void main(String[] args) {

        // Fase 1

        String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;

        System.out.println("Introdueix el nom de les ciutats: ");
        Scanner scanner = new Scanner(System.in);
        ciutat1 = scanner.nextLine();
        ciutat2 = scanner.nextLine();
        ciutat3 = scanner.nextLine();
        ciutat4 = scanner.nextLine();
        ciutat5 = scanner.nextLine();
        ciutat6 = scanner.nextLine();
        scanner.close();

        System.out.println(ciutat1);
        System.out.println(ciutat2);
        System.out.println(ciutat3);
        System.out.println(ciutat4);
        System.out.println(ciutat5);
        System.out.println(ciutat5);
        System.out.println(ciutat6);

        // Fase 2
        String[] arrayCiutats = {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};

        Arrays.sort(arrayCiutats);

        for(int i = 0; i< arrayCiutats.length; i++) {
            System.out.println(arrayCiutats[i]);
        }
        
        // Fase 3
        String[] arrayCiutatsModificades = new String[arrayCiutats.length];
        for(int i = 0; i < arrayCiutats.length; i++) {
            arrayCiutatsModificades[i] = arrayCiutats[i].replace('a','4');
        }
        Arrays.sort(arrayCiutatsModificades);
        for(int i = 0; i < arrayCiutatsModificades.length; i++) {
            System.out.println(arrayCiutatsModificades[i]);
        }

        // Fase 4
        String[][] nestedArray = new String[arrayCiutats.length][];

        for(int i = 0; i < arrayCiutats.length; i++) {
            nestedArray[i] = new String[arrayCiutats[i].length()];
            nestedArray[i] = arrayCiutats[i].split("");

            // Mostro amb els noms invertits
            String output = "";
            for(int j = nestedArray[i].length - 1; j >= 0; j--) {
                output += nestedArray[i][j];
            }

            System.out.println(output);
        }

        



    }
}