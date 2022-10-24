/**
 * keeping the track of teacher's data
 */
public class Teacher {
    private  int id;
    private String name;
    private  Float salary;
    private Float salaryEarn;

    /**
     * Creates a new teacher object
     * @param id for the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarn = 0.0F;

    }

    /**
     *
     * @return the id
     */
    public int getId(){
        return  id;
    }

    public String getName(){
        return name;
    }

    public Float getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(float salary){
        this.salary = salary;
    }

    /**
     * Add to salary
     * removes from the
     * @param salary
     */
    public void receiveSalary(float salary){
       salaryEarn+=salary;
       School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name +
                " Total salary earn so far $" + salaryEarn ;
    }
}
