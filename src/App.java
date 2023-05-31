import java.util.Scanner;
import net.mojang.lib.Character;

public class App {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String option;

        int strength;
        int defense;

        System.out.println("------------------------------");
        System.out.println("Bienvenido, jugador");
        System.out.println("------------------------------\n");

        System.out.println("Que arma desea utilizar?");
        System.out.println("    - Ninguna");
        System.out.println("    - Espada de madera");
        System.out.println("    - Espada de hierro");
        System.out.println("    - Espada de diamante");
        System.out.println("Por favor, solo indique el material. Ej: hierro");
        option = scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();

        switch(option){
            case "ninguna":
                strength = 1;
                break;
            
            case "madera":
                strength = 2;
                break;
            
            case "hierro":
                strength = 3;
                break;
            
            case "diamante":
                strength = 5;
                break;
            
            default:
                strength = 1;
                System.out.println("Lo siento, el arma solicitada no esta disponible. Por defecto peleara sin arma");
                break;
        }
        
        System.out.println("Que armadura desea utilizar?");
        System.out.println("    - Ninguna");
        System.out.println("    - De cuero");
        System.out.println("    - De hierro");
        System.out.println("    - De diamante");
        System.out.println("Por favor, solo indique el material. Ej: cuero");
        option = scanner.nextLine().replaceAll("[\\s0-9\\p{Punct}]", "").toLowerCase();

        switch(option){
            case "ninguna":
                defense = 0;
                break;
            
            case "cuero":
                defense = 1;
                break;
            
            case "hierro":
                defense = 2;
                break;
            
            case "diamante":
                defense = 3;
                break;
            
            default:
                defense = 0;
                System.out.println("Lo siento, el arma solicitada no esta disponible. Por defecto peleara sin armadura");
                break;
        }

        Character character = new Character(defense, strength);
        
    }
}

