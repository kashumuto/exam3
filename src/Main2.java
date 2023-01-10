import java.util.*;

public class Main2 {
    public static void main(String[] args) {

}
class Student {
    private String name;
    private int course;
    private String group;
    private Map<Subject, Integer> results;
    private double averageMark;

    public Student(String name, int course, String group,double averageMark) {
        this(name);
        this.course = course;
        this.group = group;
    }

    public Student(String name) {
        this.name = name;
        results = new EnumMap<>(Subject.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Map<Subject, Integer> getResults() {
        return results;
    }

    public void setResults(Map<Subject, Integer> results) {
        this.results = results;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
enum Subject {
    MATHEMATICS,
    PHYSICS,
    CHEMISTRY,
    ENGLISH,
    HISTORY;

    Subject(Integer... courses) {
        this.courses = new ArrayList<>();
        for (Integer course : courses) {
            this.courses.add(course);
        }
    }

    public List<Integer> getCourses() {
        return courses;
    }

    private List<Integer> courses;
}
class studentsInfo {
    private List<Student> students;

    public studentsInfo() {
        students = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudents() {
        students.add(new Student("Бакыт", 3, "БД-19", 3.6));
        students.add(new Student("Асель", 5, "МД-18", 3.8));
        students.add(new Student("Кайрат", 2, "АС-20", 2.9));
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void getResults() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageMark() >= 3) {
                System.out.println("Прошел экзамен");
            }
        }
    }

}
}
