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
    private double salary;
    
    
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
    public boolean canDrive(int currentYear){
        int age = currentYear - yearOfBirth; 
        if (age >= 16){
            System.out.println("They can drive");
             return true;}
            else{
            System.out.println("They cannot drive");
             return false;
            }
        
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
    private double calculatePay(double hoursWorked){
        double subtotal = hourlyWage*hoursWorked;
        double subtotal2 = hourlyWage*unpaidHours;
        double beforeTaxes = subtotal+subtotal2;
        double total = beforeTaxes - (beforeTaxes*0.30);
        return total;
        
        
        // Solution for this code. Question 13
        // Step 1. get values for unpaidHours and hourlyWage
        // Step 2. Set tax rate to 0.30
        // Step 3. set subtotal to hourlyWage x unpaid hours
        // Step 4. set total to subtotal x tax rate.
        // Step 5. Set Salary to total - subtotal.
        // Step 5. Print Salary.
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double hoursWorked){
        double total = calculatePay(hoursWorked);
        System.out.println(fullname + "has received a wire transfer of" + total + "CAD");//This is my solution for question 14.
        // step 1. Get value for Salary
        // Step 2 set transaction to Salary - paySalary
        // Step 3. set unpaidHours to 0
        // Step 4. Print (employee + "has received a wire transfer of" + 
        // moneyReceived + "Cad")
        
    }
}