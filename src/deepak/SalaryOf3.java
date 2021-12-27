package deepak;

public class SalaryOf3 {
    public static void main(String[] args) {

        //initialize salary
       int salary = 35000;

        //multiple if conitions
        if(salary>30000){
            salary += 3000;       //we can also write it as salary = salary + 3000
        }
        else if(salary>20000){
            salary += 2000;
        }
        else{
            salary += 1000;
        }

        //print the result of salary with the proper increment
        System.out.println("Your bonus is : " + salary);
    }
}
