/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth); // 
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025); 
        // Solution for this code. Question 12
        // Step 1. Set Age to currentYear - yearOfBirth.
        // Step 2. if Age>= 16 them
        //            Print "they can drive"
        //         else
        //            Print "They cannot drive"
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // Solution for this code. Question 13
        // Step 1. get values for unpaidHours and hourlyWage
        // Step 2. Set tax rate to 0.30
        // Step 3. set total to hourlyWage x unpaid hours
        // Step 4. set salary to total x tax rate.
        // Step 5. Print Salary.
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(int hourlyWage,int unpaidHours){
        int paySalary = hourlyWage - unpaidHours;
        //This is my solution for question 14.
        // step 1. Get value for Salary
        // Step 2 set moneyReceived to Salary - paySalary
        // Step 3. set unpaidHours to 0
        // Step 4. Print (employee + "has received a wire transfer of" + 
        // moneyReceived + "Cad")
        
    }
}