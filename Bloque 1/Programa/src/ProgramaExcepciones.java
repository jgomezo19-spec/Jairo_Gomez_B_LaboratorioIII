import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaExcepciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = -1;


        do {

            System.out.println("\n========== MENU EXCEPCIONES ==========");
            System.out.println("1. División segura");
            System.out.println("2. Validar número positivo");
            System.out.println("3. Convertir texto a número");
            System.out.println("4. Validar edad");
            System.out.println("5. Validar contraseña");
            System.out.println("6. Leer arreglo");
            System.out.println("7. Validar número mayor a 100");
            System.out.println("8. Validar email");
            System.out.println("9. Validar texto vacío");
            System.out.println("10. Validar longitud de texto");
            System.out.println("11. Probar charAt");
            System.out.println("12. Usar finally");
            System.out.println("13. Múltiples excepciones");
            System.out.println("0. Salir");


            try {

                System.out.print("Seleccione una opción: ");

                opcion = teclado.nextInt();


                switch(opcion) {


                    case 1:

                        divisionSegura(teclado);

                        break;


                    case 2:

                        System.out.print("Ingrese número: ");

                        int numero = teclado.nextInt();

                        validarPositivo(numero);

                        System.out.println("Número correcto.");

                        break;



                    case 3:

                        convertirTexto(teclado);

                        break;



                    case 4:

                        System.out.print("Ingrese edad: ");

                        int edad = teclado.nextInt();

                        validarEdad(edad);

                        System.out.println("Edad válida.");

                        break;



                    case 5:

                        teclado.nextLine();

                        System.out.print("Ingrese contraseña: ");

                        String password = teclado.nextLine();

                        validarPassword(password);

                        break;



                    case 6:

                        leerArreglo(teclado);

                        break;



                    case 7:

                        System.out.print("Ingrese número: ");

                        int valor = teclado.nextInt();

                        validarMayor100(valor);

                        break;



                    case 8:

                        teclado.nextLine();

                        System.out.print("Ingrese email: ");

                        String email = teclado.nextLine();

                        validarEmail(email);

                        break;



                    case 9:

                        teclado.nextLine();

                        System.out.print("Ingrese texto: ");

                        String texto = teclado.nextLine();

                        validarTexto(texto);

                        break;



                    case 10:

                        teclado.nextLine();

                        System.out.print("Ingrese texto: ");

                        String cadena = teclado.nextLine();

                        validarLongitud(cadena);

                        break;



                    case 11:

                        probarCharAt();

                        break;



                    case 12:

                        usarFinally();

                        break;



                    case 13:

                        multiplesExcepciones(teclado);

                        break;



                    case 0:

                        System.out.println("Programa finalizado.");

                        break;



                    default:

                        throw new Exception("Opción no válida.");

                }



            }catch(InputMismatchException e){

                System.out.println(
                "Error: Debe ingresar un número.");

                teclado.nextLine();

                opcion = -1;



            }catch(Exception e){

                System.out.println(
                "Error: " + e.getMessage());

                opcion = -1;

            }


        }while(opcion != 0);


        teclado.close();

    }



    // ==============================
    // DIVISIÓN SEGURA
    // ==============================

    public static void divisionSegura(Scanner teclado)
            throws Exception {


        System.out.print("Dividendo: ");

        int a = teclado.nextInt();


        System.out.print("Divisor: ");

        int b = teclado.nextInt();



        if(b == 0){

            throw new Exception(
            "No se puede dividir entre cero.");

        }


        System.out.println(
        "Resultado: " + (a / b));

    }





    // ==============================
    // NÚMERO POSITIVO
    // ==============================

    public static void validarPositivo(int numero)
            throws Exception {


        if(numero < 0){

            throw new Exception(
            "El número no puede ser negativo.");

        }

    }





    // ==============================
    // TEXTO A NÚMERO
    // ==============================

    public static void convertirTexto(Scanner teclado){


        teclado.nextLine();


        try {


            System.out.print(
            "Ingrese texto numérico: ");


            String texto = teclado.nextLine();


            int numero = Integer.parseInt(texto);


            System.out.println(
            "Número convertido: " + numero);



        }catch(NumberFormatException e){

            System.out.println(
            "Error: No se pudo convertir.");

        }

    }





    // ==============================
    // EDAD
    // ==============================

    public static void validarEdad(int edad)
            throws Exception {


        if(edad < 0){

            throw new Exception(
            "La edad no puede ser negativa.");

        }

    }





    // ==============================
    // PASSWORD
    // ==============================

    public static void validarPassword(String password)
            throws Exception {


        if(password.length() < 6){

            throw new Exception(
            "La contraseña debe tener mínimo 6 caracteres.");

        }


        System.out.println("Contraseña válida.");

    }





    // ==============================
    // ARREGLO
    // ==============================

    public static void leerArreglo(Scanner teclado){


        int[] numeros = {10,20,30};


        try {


            System.out.print(
            "Ingrese posición: ");


            int posicion = teclado.nextInt();


            System.out.println(
            "Valor: " + numeros[posicion]);



        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println(
            "Error: Índice fuera del arreglo.");

        }

    }





    // ==============================
    // EXCEPCIÓN PERSONALIZADA
    // ==============================

    public static void validarMayor100(int numero)
            throws ExcepcionPersonalizada {


        if(numero > 100){

            throw new ExcepcionPersonalizada(
            "El número no puede ser mayor a 100.");

        }


        System.out.println("Número permitido.");

    }





    // ==============================
    // EMAIL
    // ==============================

    public static void validarEmail(String email)
            throws Exception {


        if(email.isEmpty()){

            throw new Exception(
            "El email está vacío.");

        }


        if(!email.contains("@")){

            throw new Exception(
            "Email inválido.");

        }


        System.out.println(
        "Email correcto.");

    }





    // ==============================
    // TEXTO VACÍO
    // ==============================

    public static void validarTexto(String texto)
            throws Exception {


        if(texto.isEmpty()){

            throw new Exception(
            "El texto no puede estar vacío.");

        }


        System.out.println("Texto válido.");

    }





    // ==============================
    // LONGITUD TEXTO
    // ==============================

    public static void validarLongitud(String texto)
            throws Exception {


        if(texto.length() < 5){

            throw new Exception(
            "El texto es demasiado corto.");

        }


        System.out.println("Longitud correcta.");

    }





    // ==============================
    // CHARAT
    // ==============================

    public static void probarCharAt(){


        try {


            String palabra = "Java";


            System.out.println(
            palabra.charAt(10));



        }catch(StringIndexOutOfBoundsException e){

            System.out.println(
            "Error: Posición inexistente.");

        }

    }





    // ==============================
    // FINALLY
    // ==============================

    public static void usarFinally(){


        try {

            System.out.println(
            "Ejecutando proceso.");


        }finally{


            System.out.println(
            "Proceso terminado.");

        }

    }





    // ==============================
    // MÚLTIPLES EXCEPCIONES
    // ==============================

    public static void multiplesExcepciones(Scanner teclado){


        try {


            System.out.print("Ingrese número: ");

            int numero = teclado.nextInt();


            int resultado = 100 / numero;


            System.out.println(
            "Resultado: " + resultado);



        }catch(InputMismatchException e){

            System.out.println(
            "Debe ingresar un número.");


        }catch(ArithmeticException e){

            System.out.println(
            "No se puede dividir entre cero.");

        }

    }

}