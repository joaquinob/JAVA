public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Podemos comentar así si es una linea

        /*
         * O así si son varias lineas
         */
        {
            {
                // Los scopes son las tabulaciónes que se hacen al poner llaves como se ven aqui en este ejemplo, se utilizan para organizar en niveles distintos.
                // Si no se cumple no deja de funcionar, pero las buenas prácticas dicen que se debe poner. (ALT+SHIFT+F = INDENTACIÓN AUTOMATICA)
                // Al acabar una linea se debe de usar el punto y coma OBLIGATORIO.
            }
            {
                /*
                 * VARIABLE:
                 *  Espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
                 * 
                 * DECLARACIÓN:
                 *  Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
                 * 
                 * DEFINICIÓN:
                 *  Asignar el tipo de dato y el nombre de la variable dándole o sin darle un valor inicial
                 * 
                 * ASIGNACIÓN:
                 *  Darle valor a una variable ya declarada
                 * 
                 * TIPOS:
                 *  PRIMITIVAS: Almacenan valores básicos
                    * Tipos de datos enteros: 
                    *  - BYTE
                    *  - SHORT
                    *  - INT
                    *  - LONG
                    *  Se utilizan mayormente int y long, dependiendo de los valores que les des.
                    * 
                    * Tipos de datos reales: 
                    *  - FLOAT: 6 decimales
                    *  - DOUBLE: 15-16 decimales
                    *  El estandar es el double
                    * 
                    * Tipos de datos de caracteres:
                    *  - CHAR: 1 letra como string ('j')
                    *  - STRING: un string ('Joaquin')
                    * 
                    * Tipos de datos booleanos: 
                    *  - BOOLEAN: true o false
                 * 
                 *  DE REFERENCIA: Almacena direcciones de memoria que apunta a objetos.
                 * 
                 */

                 // Ejemplos:

                 String texto = "    Este texto es una practica para ver como funciona y si estoy haciendolo bien.   ";
                 System.out.println(texto);

                 // .length() para ver la longitud de un string
                 int longitud = texto.length();
                 System.out.println(longitud);

                 // .charAt() para ver un caracter dentro de un string
                 char caracter = texto.charAt(0);            
                 System.out.println(caracter);

                 // .substring() para ver que contiene el string desde el primer valor del parentesis hasta tantas posiciones más como diga el segundo valor del parentesis
                 String subcadena = texto.substring(5,16);
                 System.out.println(subcadena);

                 // .toLowerCase() para pasar todo el string a miniscula
                 String lowerCase = texto.toLowerCase();
                 System.out.println(lowerCase);

                 // .toUpperCase() para pasar el strind a mayusculas
                 String upperCase = texto.toUpperCase();
                 System.out.println(upperCase);

                 // .indexOf() para 
                 int index = texto.indexOf("ver");
                 System.out.println(index);

                 // .replace() para cambiar una palabra por otra
                 String reemplazo = texto.replace("ver", "aprender");
                 System.out.println(reemplazo);

                 // .contains() para ver si contiene algo la variable que vemos
                 boolean contiene = texto.contains("ver");
                 System.out.println("¿Contiene la palabra ver?: " + contiene);

                 // .trim() para quitar espacios antes o despues del texto del string
                 String sinEspacios = texto.trim();
                 System.out.println(sinEspacios);

                 // Para ver otros métodos se debe de poner el nombre de la variable, en este caso, texto.funcion(); debemos de probar para que funciona cada una.
            }
            {
                // OPERADORES:
                //  - ARITMETICOS: 
                // Son suma(+), resta(-), multiplicación(*), división(/) (al dividir con decimales, es decir, entregando un double, los valores que se meten deben de ser double), para ver paridad, si da 0 lo es. (%)
                int a = 5;
                int b = 1656464;
                int c = a*b;

                System.out.println(c);

                //ASIGNACION:

                // el = es el operador de asignación, es decir, para darle un valor a las variables.

                 int d = 5;
                 d = 25;

                 // Para sumar otros valores se utiliza asi:
                 d+=2;
                 System.out.println(d);
                 
                 //Incrementación:
                 d++;
                 System.out.println(d);
                 d--;
                 d--;
                 d--;
                 System.out.println(d);


                 // COMPARACIÓN:
                 // Para saber si una variable es mayor, menor o igual que otra.

                 boolean esMayor = a > d;
                 System.out.println(esMayor);

                 boolean esMenor = a < d;
                 System.out.println(esMenor);

                 boolean esIgual = a == d;
                 System.out.println(esIgual);


                 //DE LÓGICA:

                 boolean condición1 = true;
                 boolean condición2 = false;

                 /*
                  * TABLA DE LA VERDAD:
                  AND: Para ser = true ambas condiciones deben de ser true;
                  OR: Para ser = true una de las condiciones debe de ser true;
                  NOT: Para ser = true la condicion debe de ser false, es decir, se contradice.
                  */

                 boolean AND = condición1 && condición2;
                 boolean OR = condición1 || condición2;
                 boolean NOT = !condición1;

                 System.out.println(AND);
                 System.out.println(OR);
                 System.out.println(NOT);
            }
            {
                // CONDICIONALES:

                // Vamos a usar las estructras de control if(){}, else if (){} y else{}
                int edad = 23;
                edad = 15;
                edad = 18;
                edad = 60;

                if (edad >= 18 && edad < 60) {
                    System.out.println("Puedes entrar a la disco");
                }else if(edad >= 60){
                    System.out.println("Vayase a casa viejales esto es para jóvenes");
                } else{
                    System.out.println("¡Vuelve a casa canijo!");
                }


                // SWITCH
                String bebida1 = "cafe"; 
                String bebida = "cerveza";

                switch (bebida1) {
                    case "cafe":
                        System.out.println("qué rico");
                        break;
                    case "refresco":
                        System.out.println("Mucho cuidado que es malo para la salud");
                        break;
                    case "cerveza":
                        System.out.println("No te apetece darte una vuelta en el coche?");
                        break;
                    case "mate":
                        System.out.println("que horror debes de ser argentino puaj");
                        break;
                
                    default: 
                        System.out.println("Si sale este mensaje elige una bebida de hombres no leche");
                        break;
                }

                // Esto es lo mismo que hacer un codigo con if como el siguiente:

                if (bebida == "cafe") {
                    System.out.println("qué rico");
                } else if(bebida == "mate"){
                    System.out.println("que horror debes de ser argentino puaj");
                } else if(bebida == "refresco"){
                    System.out.println("Mucho cuidado que es malo para la salud");
                } else if(bebida == "cerveza"){
                    System.out.println("No te apetece darte una vuelta en el coche?");
                } else {
                    System.out.println("Si sale este mensaje elige una bebida de hombres, no leche");;
                }
            } 
            {
                // BUCLES

                // FOR
                int i;
                //el bulce debe de organizarse asi: for(inicialización; condición; actualización) 
                // Puede haber un bucle dentro de otro bucle. Se vería asi: i: 1, j: 1, i: 2, j:2...

                for(i = 1; i <= 10; i++){
                    System.out.println(i);
                }

                //WHILE
                
                int contador = 1;

                while (contador <= 5) {
                    System.out.println(contador);

                    //Actualización de la variable:
                    contador++;

                }
                
                System.out.println(contador);
                //Llega a 6 pq al llegar 5 se suma despues de hacer syso cuando se hace el bucle con el 5 pero ya no se vuelve a pintar dentro del bucle


                //DO WHILE

                // Permite hacer acciones antes de checkear si se cumple la condición, es decir, se checkea al final de la vuelta.
                int cuenta = 1;
                do {
                    System.out.println("Esto sucede antes de empezar");
                    System.out.println(cuenta);
                    cuenta++;
                } while (cuenta <=5);

                System.out.println(cuenta);;
            }
            {
                // CONTROLES DE FLUJO:

                int i;

                //BREAK: se utiliza para cortar el bucle, es decir, al cortar el bucle en este caso, se pinta hasta el 5 del if.

                for(i = 1; i <= 10; i++){
                    System.out.println(i);
                    if (i == 5) {
                        break;
                    }
                    System.out.println(i);
                }

                // CONTINUE: A diferencia del break saltea las lineas que continuan del scope, en este caso, no pinta el 5 dentro del if;
                for(i = 1; i <= 10; i++){
                    System.out.println(i);
                    if (i == 5) {
                        continue;
                    }
                    System.out.println(i);
                }

                //RETURN: A diferencia del break se utiliza tmb para cortar bucles, pero retorna valores.
                for(i = 1; i <= 10; i++){
                    System.out.println(i);
                    if (i == 5) {
                        return;
                    }
                    System.out.println(i);
                }
            }
            {
                /*ARREGLOS: 
                Estructuras de datos que pueden tener valores del mismo tipo bajo un mismo nombre. 
                Estos valores se distribuyen secuencialmente en la memoria y se pueden acceder a ellos mediante un índice.
                Los arreglos tmb se pueden llamar Vectores o Matrices.
                */

                // int[] numeros = new int[5];

                // numeros[0] = 10;
                // numeros[1] = 20;
                // numeros[3] = 30;
                // numeros[4] = 40;

                int[] numeros = {10, 20, 30, 40, 50};

                numeros[2] = 1283;

                //foreach:
                int indice = 0;

                for (int numero : numeros) {
                    System.out.println(numero);
                    System.out.println(indice);
                    indice++;
                }

                // for(int indice = 0; indice < numeros.length; indice++){
                //     System.out.println(numeros[indice]);
                // }

                System.out.println(numeros.length);
            }
            {
                
            }
        }

    }
}
