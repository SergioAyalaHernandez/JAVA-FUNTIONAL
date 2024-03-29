# Proyecto de Programación Funcional en Java

Este proyecto ilustra el uso de la programación funcional en Java, mostrando cómo aplicar diferentes interfaces funcionales y patrones para manipular datos y estructuras de control de flujo. A través de ejemplos concretos, se demuestra el poder y la flexibilidad de la programación funcional en Java.

## Lenguaje Utilizado

- **Java**: Este proyecto está desarrollado íntegramente en Java, aprovechando sus capacidades de programación funcional introducidas a partir de Java 8.

## Requisitos Previos

Para ejecutar este proyecto, necesitarás:

- JDK 1.8 o superior.
- Un IDE de tu elección (Eclipse, IntelliJ IDEA, etc.) o utilizar el compilador de línea de comandos `javac`.

## Cómo Ejecutar

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE o navega hasta el directorio del proyecto en la terminal.
3. Compila el código utilizando el compilador de Java o la herramienta de construcción de tu IDE.
4. Ejecuta el programa principal o los ejemplos individuales que te interesen.

## Ejemplos Incluidos


### Funciones Unarias y Binarias
- `UnaryOperator`: Modifica un texto añadiendo comillas y un signo de exclamación.
- `BiFunction`: Ejemplos de multiplicación y ajuste de texto a la izquierda.

### java
UnaryOperator<String> quote = text -> "\"" + text + "\"";
UnaryOperator<String> addMark = text -> text + "!";
BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;
BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);


### `Encadenamiento de Métodos`
- Demonstración de cómo encadenar métodos para construir una secuencia lógica de operaciones.
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("hola").append("como").append("estas");
Chainer chainer = new Chainer().sayhi().sayBye();

### `Operaciones Matemáticas Avanzadas`
- Uso de Function para crear flujos de operaciones matemáticas complejas.

Function<Integer, Integer> multiplyBy3 = x -> x * 3;
Function<Integer, Integer> add1MultriplyBy3 = multiplyBy3.compose(y -> y + 1);
Function<Integer, Integer> andSquare = add1MultriplyBy3.andThen(x -> x * x);

### `Inferencia de Tipos y Sintaxis Lambda`
Ejemplos de cómo Java infiere tipos en expresiones lambda y la flexibilidad de la sintaxis.

List<String> alumnos = Arrays.asList("Juan", "Sergio", "Luis");
alumnos.forEach(System.out::println);

### `Uso de Optionals`
Cómo manejar valores que podrían ser null de forma segura con Optional.

Optional<String> valuablePlayer = Optional.ofNullable("Sergio");
String playerName = valuablePlayer.orElse("No Player");

### `Streams y Transformaciones`
Manipulación de colecciones de datos con operaciones de stream.

List<String> courseList = Arrays.asList("JAVA!", "Frontend", "Backend", "FullStack");
courseList.stream().map(String::toLowerCase).forEach(System.out::println);

### `Interfaz Funcional y Expresiones Lambda`
Definición de interfaces funcionales y su implementación utilizando expresiones lambda.

@FunctionalInterface
interface StringOperation {
void operate(String text);
}
StringOperation six = () -> System.out.println("Alumno");

### `Uso de Optional y Stream para Procesamiento Avanzado`
Ejemplos de cómo Optional y Stream pueden simplificar el código para operaciones condicionales y de procesamiento de datos.

Optional<List<String>> optionalNames = getOptionalNames();
optionalNames.ifPresent(names -> names.forEach(System.out::println));
