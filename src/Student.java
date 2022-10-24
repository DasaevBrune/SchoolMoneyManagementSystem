public class Student {

    private int id;
    private String name;
    private int grade;
    private int fessPaid;
    private int feesTotal;

    /**
     * To create a new Student object by initializing.
     * Fees for every student is $20.000
     * Fees paid initialy is 0;
     * @param id id for the student: unique.
     * @param name of the student
     * @param grade grade of the student
     */
    public Student (int id, String name, int grade){
        fessPaid = 0;
        feesTotal = 20000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter Student's name.

    /**
     * Used to update the studfents's grade.
     * @param grade new grade of the studenr.
     */
    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field
     * Add the fees to the fees paid
     * The school is going tu receive the funds
     * @param fees that student paid
     */
    public void payFees(int fees){
        fessPaid += fees;
        School.updateTotalMoneyEarned(fessPaid);
    }


    // getters returns each student data
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFessPaid() {
        return fessPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return remaining fees
     */
    public int getRemainingFess(){
        return feesTotal - fessPaid;
    }

    @Override
    public String toString() {
        return "Student's name " + name + "Total fees paid so far $" + fessPaid;
    }
}
