package school.management.system;

/**
 * Created by Sree Sai Nandini Gundraju on 26/6/2024.
 * This class is responsible for keeping the track of
 * students fees, name, grade and fees paid.
 */


public class Student {

    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    /**
     * To create a new student by initialising the values.
     * Fees for every student is $30,000 per year.
     * Fees paid initially is 0
     * @param id id for the student : unique
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id, String name, int grade){
        this.fees_paid = 0;
        this.fees_total = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name and id


    /**
     * Used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }


    /**
     * Keep Adding the fees to the fees_paid field.
     * The school is going to receive the funds.
     *
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        this.fees_paid += fees;
        School.updateTotal_money_earned(fees);

    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return this.id;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return this.grade;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return this.name;
    }


    /**
     *
     * @return fees paid by the student upto now
     */
    public int getFeesPaid() {
        return this.fees_paid;
    }

    /**
     *
     * @return total fees to be paid by the student
     */
    public int getFeesTotal() {
        return this.fees_total;
    }

    /**
     *
     * @return The remaining fee
     */
    public int getRemainingfee(){
        return fees_total - this.fees_paid;
    }


}
