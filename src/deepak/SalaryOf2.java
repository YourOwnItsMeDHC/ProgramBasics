package deepak;

public class SalaryOf2 {
    public static void main(String[] args) {

        int salary = 35000;

        //if condition
        if(salary>30000){
            salary += 2000;
        }
        else{
            salary +=1000;
        }

        //Print the salary with appropriate increment
        System.out.println("Your salary with increment is" + " " + salary);
    }


}
