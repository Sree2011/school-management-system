package school.management.system;
import java.util.*;

/**
 * A school can have many teachers, many students
 * Implements teachers and students using ArrayList
 */
public class School {

    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private static int total_money_earned;
    private static int total_money_spent;

    /**
     * New school object is created
     * @param teacher List of teachers in the school
     * @param student List of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        this.total_money_earned = 0;
        this.total_money_spent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Add a teacher to the school
     * @param teacher1 the teacher to be added
     */
    public void addTeacher(Teacher teacher1) {
        this.teachers.add(teacher1);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudent() {
        return this.students;
    }

    /**
     * Adds new student to the school
     * @param student1 Student to be added to the school
     */
    public void addStudent(Student student1) {
        this.students.add(student1);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotal_money_earned() {
        return total_money_earned;
    }

    /**
     *
     * @param total_money_earned adds the total money earned
     */
    public static void updateTotal_money_earned(int money_earned) {
        total_money_earned += money_earned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotal_money_spent() {
        return total_money_spent;
    }

    /**
     * The salary given by the school to the teachers
     * @param total_money_spent adds the total money spent by the school
     */
    public static void updateTotal_money_spent(int total_money_spent) {
        total_money_earned -= total_money_spent;
    }

}
