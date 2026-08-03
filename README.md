# 📚 Ejercicios de Java - Programación Orientada a Objetos y Excepciones

Este repositorio contiene tres niveles de ejercicios realizados en Java, donde se aplican conceptos fundamentales del lenguaje, desde el manejo de errores hasta conceptos avanzados de Programación Orientada a Objetos (POO).

Cada nivel representa una etapa de aprendizaje diferente y demuestra el uso correcto de clases, métodos, validaciones, excepciones, herencia, polimorfismo, abstracción e interfaces.

---

# 🟢 Nivel 1: Fundamentos de Java + Excepciones

## 📌 Descripción

Este ejercicio está enfocado en el manejo de errores mediante **excepciones en Java**.

El programa utiliza estructuras como `try`, `catch`, `finally`, `throw` y `throws` para controlar situaciones inesperadas durante la ejecución, evitando que el programa termine de forma incorrecta.

Además, cuenta con un menú interactivo que permite probar diferentes validaciones y errores controlados por el programa.

## ⚙️ Funcionalidades principales

✅ Captura de errores al dividir entre cero.  
✅ Validación de entradas del usuario mediante `try-catch`.  
✅ Conversión segura de texto a números.  
✅ Validación de edad para evitar valores negativos.  
✅ Validación de contraseñas con longitud mínima.  
✅ Control de posiciones inválidas en arreglos.  
✅ Validación de correos electrónicos.  
✅ Validación de textos vacíos y longitud mínima.  
✅ Manejo de errores al utilizar `charAt()`.  
✅ Uso de `throw` para generar errores manualmente.  
✅ Creación de excepciones personalizadas.  
✅ Uso de `finally` para ejecutar instrucciones finales.  
✅ Menú con manejo de errores y control de entradas.

---

## 🔹 Manejo de múltiples excepciones

El programa incluye una opción para manejar diferentes tipos de errores utilizando varios bloques `catch`.

Esta función realiza una operación matemática solicitando un número al usuario y controla posibles problemas durante la ejecución. Si el usuario ingresa un dato incorrecto, como texto en lugar de un número, el programa captura la excepción de entrada inválida. También controla el error producido al intentar realizar una división entre cero.

Su función es identificar el tipo de error ocurrido y mostrar un mensaje específico para cada caso, evitando que el programa se cierre inesperadamente.

**Errores controlados:**

- 🔢 `InputMismatchException`: ocurre cuando el usuario ingresa un valor que no corresponde al tipo de dato esperado.
- ➗ `ArithmeticException`: ocurre cuando se intenta realizar una división entre cero.
- ✅ Entrada correcta: permite realizar la operación y mostrar el resultado.

Este ejercicio demuestra cómo Java puede manejar diferentes excepciones dentro de un mismo bloque de código utilizando múltiples instrucciones `catch`.

---

## 🎯 Objetivo

Aprender a controlar errores de manera profesional, permitiendo que los programas sean más seguros, estables y capaces de manejar entradas incorrectas del usuario.

---

# 🟡 Nivel 2: Programación Orientada a Objetos Básica

## 📌 Descripción

Este ejercicio aplica los principios básicos de la **Programación Orientada a Objetos (POO)** mediante la creación de clases, objetos y métodos.

Se implementa el concepto de **encapsulamiento**, protegiendo los atributos de las clases mediante el modificador de acceso privado (`private`) y utilizando métodos getters y setters para controlar el acceso y modificación de los datos.

## ⚙️ Funcionalidades principales

✅ Creación de clases con atributos privados.  
✅ Uso de constructores para inicializar objetos.  
✅ Implementación de getters y setters.  
✅ Validación de datos ingresados.  
✅ Creación y manejo de múltiples objetos.  
✅ Gestión de cuentas con depósitos y retiros.  
✅ Creación de listas de productos mediante `ArrayList`.  
✅ Cálculo de promedio de estudiantes.  
✅ Control de información de empleados.

## 🎯 Objetivo

Comprender la estructura de la Programación Orientada a Objetos, organizando el código mediante clases y objetos, aplicando encapsulamiento y reutilización de código.

---

# 🔴 Nivel 3: Programación Orientada a Objetos Avanzada

## 📌 Descripción

Este ejercicio implementa conceptos avanzados de la **Programación Orientada a Objetos**, utilizando herencia, polimorfismo, abstracción e interfaces.

El programa demuestra cómo diferentes clases pueden relacionarse entre sí, compartir características y definir comportamientos específicos.

---

## ⚙️ Funcionalidades principales

### 🧬 Herencia

Permite crear nuevas clases basadas en clases existentes.

Ejemplo:

- `Perro` y `Gato` heredan características de `Animal`.

Esto permite reutilizar código y extender funcionalidades.

---

### 🔄 Polimorfismo

Permite utilizar un mismo método con diferentes comportamientos dependiendo del objeto utilizado.

Ejemplo:

- Cada animal implementa su propio comportamiento mediante el método `sonido()`.

El programa utiliza una lista de objetos tipo `Animal` y ejecuta el mismo método en diferentes clases.

---

### 🧩 Abstracción

Permite crear clases generales que sirven como base para otras clases.

Ejemplo:

- La clase abstracta `Figura` define el método `area()`.
- `Cuadrado` y `Circulo` implementan su propia forma de calcular el área.

---

### 🔌 Interfaces

Permiten establecer comportamientos que diferentes clases deben implementar.

Ejemplo:

- La interfaz `Vehiculo` define el método `mover()`.
- Las clases `Carro` y `Moto` implementan dicho comportamiento.

---

## 🎯 Objetivo

Aplicar conceptos avanzados de POO para crear programas más organizados, flexibles y fáciles de mantener, utilizando relaciones entre clases y reutilización de código.

---

# 🛠️ Tecnologías utilizadas

💻 Lenguaje: Java  
☕ JDK  
🖥️ IDE: Eclipse / IntelliJ IDEA / NetBeans  

---

# 📈 Conocimientos aplicados

- Fundamentos de Java
- Variables y métodos
- Manejo de excepciones
- Programación Orientada a Objetos
- Encapsulamiento
- Herencia
- Polimorfismo
- Abstracción
- Interfaces
- Colecciones (`ArrayList`)
- Validación de datos
- Control de errores

---

⭐ Proyecto realizado como práctica de aprendizaje de Java y Programación Orientada a Objetos.
