import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // OBJETO PERSONA
        System.out.println("----- PERSONA -----");

        Persona p1 = new Persona("Jairo", 20);
        p1.mostrarDatos();

        // OBJETO CUENTA
        System.out.println("\n----- CUENTA -----");

        Cuenta cuenta = new Cuenta(1000);

        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.mostrarSaldo();


        // LISTA DE PRODUCTOS
        System.out.println("\n----- PRODUCTOS -----");

        ArrayList<Producto> listaProductos = new ArrayList<>();

        listaProductos.add(new Producto("Laptop", 5000));
        listaProductos.add(new Producto("Mouse", 150));
        listaProductos.add(new Producto("Teclado", 300));

        for (Producto producto : listaProductos) {
            producto.mostrarProducto();
        }


        // ESTUDIANTE
        System.out.println("\n----- ESTUDIANTE -----");

        Estudiante estudiante = new Estudiante("Carlos");

        estudiante.agregarNota(80);
        estudiante.agregarNota(90);
        estudiante.agregarNota(70);

        estudiante.mostrarResultado();


        // EMPLEADOS
        System.out.println("\n----- EMPLEADOS -----");

        Empleado e1 = new Empleado("Ana", 4000);
        Empleado e2 = new Empleado("Luis", 5500);

        e1.mostrarDatos();
        e2.mostrarDatos();

    }
}


// CLASE PERSONA
class Persona {

    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        setEdad(edad);

    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {

        if (edad >= 0) {
            this.edad = edad;
        } 
        else {
            System.out.println("Edad no válida");
        }

    }


    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }

}


// CLASE CUENTA
class Cuenta {

    private double saldo;


    public Cuenta(double saldo) {

        this.saldo = saldo;

    }


    public void depositar(double cantidad) {

        if(cantidad > 0) {

            saldo += cantidad;

        } else {

            System.out.println("Cantidad inválida");

        }

    }


    public void retirar(double cantidad) {

        if(cantidad > 0 && cantidad <= saldo) {

            saldo -= cantidad;

        } else {

            System.out.println("Saldo insuficiente");

        }

    }


    public void mostrarSaldo() {

        System.out.println("Saldo actual: Q" + saldo);

    }

}


// CLASE PRODUCTO
class Producto {

    private String nombre;
    private double precio;


    public Producto(String nombre, double precio) {

        this.nombre = nombre;
        setPrecio(precio);

    }


    public void setPrecio(double precio) {

        if(precio > 0) {

            this.precio = precio;

        } else {

            System.out.println("Precio inválido");

        }

    }


    public void mostrarProducto() {

        System.out.println("Producto: " + nombre);
        System.out.println("Precio: Q" + precio);

    }

}


// CLASE ESTUDIANTE
class Estudiante {

    private String nombre;
    private ArrayList<Double> notas;


    public Estudiante(String nombre) {

        this.nombre = nombre;
        notas = new ArrayList<>();

    }


    public void agregarNota(double nota) {

        if(nota >= 0 && nota <= 100) {

            notas.add(nota);

        } else {

            System.out.println("Nota inválida");

        }

    }


    public double calcularPromedio() {

        double suma = 0;


        for(double nota : notas) {

            suma += nota;

        }


        return suma / notas.size();

    }


    public void mostrarResultado() {

        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + calcularPromedio());

    }

}


// CLASE EMPLEADO
class Empleado {

    private String nombre;
    private double salario;


    public Empleado(String nombre, double salario) {

        this.nombre = nombre;
        setSalario(salario);

    }


    public void setSalario(double salario) {

        if(salario > 0) {

            this.salario = salario;

        } else {

            System.out.println("Salario inválido");

        }

    }


    public void mostrarDatos() {

        System.out.println("Empleado: " + nombre);
        System.out.println("Salario: Q" + salario);

    }

}