import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Se declara una lista mutable para almacenar los objetos Students.
    private static List<Students> studentsList;

    public static void main(String[] args) throws IOException {
        // Método principal que llama a todas las funciones para realizar las operaciones requeridas.
        loadStudentData(); // Carga los datos de los estudiantes desde el archivo CSV.
        aspirantesPorCarrera(); // Realiza la operación de aspirantes por carrera.
        totalMujeresPorCarrera(); // Realiza la operación de total de mujeres por carrera.
        totalHombresPorCarrera(); // Realiza la operación de total de hombres por carrera.
        estudianteMayorPuntajePorCarrera(); // Encuentra el estudiante con el puntaje más alto por carrera.
        estudianteMayorPuntajeGeneral(); // Encuentra el estudiante con el puntaje más alto de todos.
        puntajePromedioPorCarrera(); // Calcula el puntaje promedio por carrera.
    }

    // Método para cargar los datos de los estudiantes desde el archivo CSV utilizando Stream y expresiones regulares.
    private static void loadStudentData() throws IOException {
        String filePath = "students-scores.csv";
        studentsList = Files.lines(Paths.get(filePath)) // Utiliza Files.lines para obtener un Stream de líneas del archivo.
            .skip(1) // Omite la primera línea que contiene los encabezados.
            .map(line -> {
                String[] details = line.split(","); // Divide la línea en campos utilizando la expresión regular de coma.
                // Realiza el mapeo de los campos del CSV a los atributos del objeto Students.
                // Se utilizan expresiones regulares y parseo para convertir los tipos de datos según sea necesario.
                return new Students(
                    Integer.parseInt(details[0]), details[1], details[2], details[3], details[4],
                    Boolean.parseBoolean(details[5]), Integer.parseInt(details[6]), Boolean.parseBoolean(details[7]),
                    Integer.parseInt(details[8]), details[9], Integer.parseInt(details[10]), Integer.parseInt(details[11]),
                    Integer.parseInt(details[12]), Integer.parseInt(details[13]), Integer.parseInt(details[14]),
                    Integer.parseInt(details[15]), Integer.parseInt(details[16])
                );
            })
            .collect(Collectors.toList()); // Recopila los objetos Students en una lista mutable.
    }

    // Método para mostrar la cantidad de aspirantes por carrera utilizando la colección de reducción mutable.
    private static void aspirantesPorCarrera() {
        // Utiliza Collectors.groupingBy para agrupar los estudiantes por su campo de carreraAspiration.
        // Cuenta la cantidad de estudiantes por cada grupo y muestra el total por carrera.
        System.out.println("Aspirantes por carrera:");
        studentsList.stream() // Utiliza Stream para realizar operaciones en la lista de estudiantes.
            .collect(Collectors.groupingBy(Students::getCareerAspiration)) // Agrupa los estudiantes por su carrera.
            .forEach((career, students) -> {
                System.out.println(career + ": " + students.size()); // Muestra el nombre de la carrera y la cantidad de estudiantes.
            });
    }

    // Método para contar la cantidad total de mujeres por carrera utilizando la colección de reducción mutable.
    private static void totalMujeresPorCarrera() {
        // Utiliza Collectors.groupingBy y Collectors.counting para contar el total de mujeres por carrera.
        System.out.println("\nTotal de mujeres por carrera:");
        studentsList.stream() // Utiliza Stream para realizar operaciones en la lista de estudiantes.
            .filter(student -> student.getGender().equals("female")) // Filtra los estudiantes por género femenino.
            .collect(Collectors.groupingBy(Students::getCareerAspiration, Collectors.counting())) // Agrupa y cuenta por carrera.
            .forEach((career, count) -> System.out.println(career + ": " + count)); // Muestra el nombre de la carrera y la cantidad de mujeres.
    }

    // Método para contar la cantidad total de hombres por carrera utilizando la colección de reducción mutable.
    private static void totalHombresPorCarrera() {
        // Utiliza Collectors.groupingBy y Collectors.counting para contar el total de hombres por carrera.
        System.out.println("\nTotal de hombres por carrera:");
        studentsList.stream() // Utiliza Stream para realizar operaciones en la lista de estudiantes.
            .filter(student -> student.getGender().equals("male")) // Filtra los estudiantes por género masculino.
            .collect(Collectors.groupingBy(Students::getCareerAspiration, Collectors.counting())) // Agrupa y cuenta por carrera.
            .forEach((career, count) -> System.out.println(career + ": " + count)); // Muestra el nombre de la carrera y la cantidad de hombres.
    }

    // Método para encontrar al estudiante con el puntaje más alto por carrera utilizando la colección de reducción mutable.
    private static void estudianteMayorPuntajePorCarrera() {
        // Utiliza Collectors.groupingBy y Collectors.maxBy para encontrar al estudiante con el puntaje más alto por carrera.
        System.out.println("\nEstudiante con el puntaje más alto por carrera:");
        studentsList.stream() // Utiliza Stream para realizar operaciones en la lista de estudiantes.
            .collect(Collectors.groupingBy(Students::getCareerAspiration,
                Collectors.maxBy(Comparator.comparingInt(Students::getMathScore)))) // Encuentra al estudiante con el puntaje más alto por carrera.
            .forEach((career, topStudent) -> {
                topStudent.ifPresent(student -> System.out.println(career + ": " + student.getFirstName() + " " + student.getLastName() + " - Puntaje: " + student.getMathScore()));
            }); // Muestra el nombre del estudiante, su carrera y su puntaje más alto.
    }

    // Método para encontrar al estudiante con el puntaje más alto de todos utilizando la colección de reducción mutable.
    private static void estudianteMayorPuntajeGeneral() {
        // Utiliza Stream.max para encontrar al estudiante con el puntaje más alto de todos.
        Optional<Students> topStudent = studentsList.stream()
            .max(Comparator.comparingInt(Students::getMathScore)); // Encuentra al estudiante con el puntaje más alto de todos.
        System.out.println("\nEstudiante con el puntaje más alto de todos:");
        topStudent.ifPresent(student -> System.out.println(student.getFirstName() + " " + student.getLastName() + " - Puntaje: " + student.getMathScore())); // Muestra el nombre del estudiante y su puntaje más alto.
    }

    // Método para calcular el puntaje promedio por carrera utilizando la colección de reducción mutable.
    private static void puntajePromedioPorCarrera() {
        // Utiliza Collectors.averagingInt para calcular el puntaje promedio por carrera.
        System.out.println("\nPuntaje promedio por carrera:");
        studentsList.stream() // Utiliza Stream para realizar operaciones en la lista de estudiantes.
            .collect(Collectors.groupingBy(Students::getCareerAspiration,
                Collectors.averagingInt(Students::getMathScore))) // Calcula el puntaje promedio por carrera.
            .forEach((career, average) -> System.out.println(career + ": " + average)); // Muestra el nombre de la carrera y el puntaje promedio.
    }
}
