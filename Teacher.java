package school.management.system;


/**
 * Created by Sree Sai Nandini Gundraju on 26/6/2024.
 * This class is responsible for keeping
 * the track of teacher's name, id and the salary
 */
public class Teacher {

    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher Object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id for the teacher
     */
    public int getId(){
        return this.id;
    }

    /**
     *
     * @return the name of the teacher
     */
    public String getName(){
        return this.name;
    }


    /**
     *
     * @return the salary of the teacher
     */
    public int getSalary(){
        return this.salary;
    }

    /**
     * Set the salary
     * @param salary salary of the teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to the teacher's salary
     * Removes form total money earned by the school.
     * @param salary the salary recieved by the teacher
     */
    public void receiveSalary(int salary){
        this.salary += salary;
        School.updateTotal_money_spent(salary);
    }
}
