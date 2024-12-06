import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Массив студентов
        Student[] students = {
                new Student("Кузнецов М.Ю.", "Информационные системы", 2024, 4.5),
                new Student("Коротаева А.А.", "Информационные системы", 2024, 4.5),
                new Student("Хазова К.С.", "Информационные системы", 2021, 4.8),
                new Student("Кочетков Н.А.", "Информационные системы", 2024, 4.2),
                new Student("Демидов А.В.", "Информационные системы", 2024, 4.0),
                new Student("Киселев Д.А.", "Информационные системы", 2023, 4.9)
        };

        // Массив аспирантов
        Postgraduate[] postgraduates = {
                new Postgraduate("Кузнецов М.Ю.", "Информационные системы", 2024, 4.6, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07"),
                new Postgraduate("Коротаева А.А.", "Информационные системы", 2024, 4.7, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07"),
                new Postgraduate("Хазова К.С.", "Информационные системы", 2021, 4.7, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07"),
                new Postgraduate("Кочетков Н.А.", "Информационные системы", 2024, 4.7, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07"),
                new Postgraduate("Демидов А.В.", "Информационные системы", 2024, 4.5, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07"),
                new Postgraduate("Киселев Д.А.", "Информационные системы", 2024, 4.9, "Преподаватель по Алгоритмизации: Ищук Денис Николаевич", "09.02.07")
        };

        // Получение трех студентов первого курса с самым высоким рейтингом
        System.out.println("Три студента первого курса с самым высоким рейтингом:");
        Arrays.stream(students)
                .filter(student -> student.getAdmissionYear() == 2024 && student.getFaculty().equals("Информационные системы"))
                .sorted(Comparator.comparingDouble(Student::getRating).reversed())
                .limit(3)
                .forEach(student -> System.out.println(student.getInfo()));

        // Получение трех студентов первого курса с самым низким рейтингом
        System.out.println("Три студента первого курса с самым низким рейтингом:");
        Arrays.stream(students)
                .filter(student -> student.getAdmissionYear() == 2024 && student.getFaculty().equals("Информационные системы"))
                .sorted(Comparator.comparingDouble(Student::getRating).reversed())
                .limit(3)
                .forEach(student -> System.out.println(student.getInfo()));

        // Проверка, кто из аспирантов 09.02.07 завершает обучение в текущем году
        int currentYear = 2024; // Текущий год
        System.out.println("\nАспиранты специальности 09.02.07, завершающие обучение в текущем году:");
        Arrays.stream(postgraduates)
                .filter(postgraduate -> postgraduate.getSpecialtyCode().equals("09.02.07") &&
                        (postgraduate.getAdmissionYear() + 3) == currentYear)
                .forEach(postgraduate -> System.out.println(postgraduate.getInfo()));


        // Полная информация обо всех студентах и аспирантах
        System.out.println("\nИнформация обо всех студентах и аспирантах:");
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
        for (Postgraduate postgraduate : postgraduates) {
            System.out.println(postgraduate.getInfo());
        }
    }
}