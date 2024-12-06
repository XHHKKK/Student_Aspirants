import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

// класс Студент
class Student {
    private String name;
    private String faculty;
    private int admissionYear;
    private double rating;

    public Student(String name, String faculty, int admissionYear, double rating) {
        this.name = name;
        this.faculty = faculty;
        this.admissionYear = admissionYear;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public double getRating() {
        return rating;
    }

    public String getInfo() {
        return "Студент: " + name + ", Факультет: " + faculty +
                ", Год поступления: " + admissionYear +
                ", Рейтинг: " + rating;
    }
}