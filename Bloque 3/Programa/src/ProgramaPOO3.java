import java.util.ArrayList;

public class ProgramaPOO3 {

    public static void main(String[] args) {


        // ==========================================
        // NIVEL 3 POO
        // HERENCIA
        // ==========================================

        System.out.println("========== HERENCIA ==========");


        // Creamos un objeto Perro
        // Perro hereda de la clase Animal

        Perro perro = new Perro();

        perro.sonido();


        // Creamos un objeto Gato
        // Gato también hereda de Animal

        Gato gato = new Gato();

        gato.sonido();



        // ==========================================
        // POLIMORFISMO
        // ==========================================

        System.out.println("\n========== POLIMORFISMO ==========");


        // Creamos una lista de tipo Animal

        ArrayList<Animal> listaAnimales = new ArrayList<>();


        // Agregamos diferentes objetos

        listaAnimales.add(new Perro());
        listaAnimales.add(new Gato());


        // Ejecutamos el mismo método
        // pero cada objeto responde diferente

        for (Animal animal : listaAnimales) {

            animal.sonido();

        }



        // ==========================================
        // ABSTRACCIÓN
        // ==========================================

        System.out.println("\n========== ABSTRACCIÓN ==========");


        // Lista de figuras abstractas

        ArrayList<Figura> listaFiguras = new ArrayList<>();


        // Agregamos diferentes tipos de figuras

        listaFiguras.add(new Cuadrado(5));
        listaFiguras.add(new Circulo(3));



        // Calculamos el área de cada figura

        for (Figura figura : listaFiguras) {

            System.out.println("Figura: " 
                    + figura.getClass().getSimpleName());

            System.out.println("Área: " 
                    + figura.area());

        }



        // ==========================================
        // INTERFAZ VEHÍCULO
        // ==========================================

        System.out.println("\n========== INTERFAZ VEHÍCULO ==========");


        // Creamos objetos usando la interfaz

        Vehiculo vehiculo1 = new Carro();

        Vehiculo vehiculo2 = new Moto();



        // Ejecutamos el mismo método
        // en diferentes clases

        vehiculo1.mover();

        vehiculo2.mover();



        // ==========================================
        // PRUEBA FINAL
        // ==========================================

        System.out.println("\n========== PROGRAMA FINALIZADO ==========");

        System.out.println("Todos los conceptos de POO fueron ejecutados correctamente.");

    }

}