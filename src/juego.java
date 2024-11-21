import java.util.Scanner;

public class juego {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora");
        System.out.println("Elige una de las siguientes opciones: ");
        System.out.println("1- Café");
        System.out.println("2- Mate");
        System.out.println("3- Refresco");
        System.out.println("4- Cerveza");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("qué rico");
                break;
            case 2:
                System.out.println("que horror debes de ser argentino puaj");
                break;
            case 3:
                System.out.println("Mucho cuidado que es malo para la salud");
                break;
            case 4:
                System.out.println("No te apetece darte una vuelta en el coche?");
                break;
        
            default: 
                System.out.println("Opción no valida");
                break;
        }
        if (opcion < 4) {
            System.out.println("¡Disfrute de su bebida!");            
        } else {
            System.out.println("Fin del programa");
        }
        scanner.close();
    }
}
