import java.util.Scanner;

public class juego2 {
    public static void main(String[] args) throws Exception {
        //scanner permite que el user escriba
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones:
        String palabraSecreta = "polimardo";
        int intentosMax = 3;
        int intentos = 0;
        boolean adivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            // System.out.println(letrasAdivinadas[i]);
        };

        // Bucle que se repite el num max de intentos
        while(!adivinada && intentos <= intentosMax){ 
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra");

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra inocorrecta, te quedan " + (intentosMax - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                adivinada = true;
                System.out.println("Felicidades has adivinado la palabra: " + palabraSecreta);
            }
        }

        if (!adivinada) {
            System.out.println("Game Over. La palabra era " + palabraSecreta);
        }

        scanner.close();
    }
}
