package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary <= 10000){
            System.out.println(salary - (salary/100)*15);
        } else if (salary > 10000 && salary <=20000){
            System.out.println(salary - (salary/100)*18);
        } else if (salary > 20000){
            System.out.println(salary - (salary/100)*20);
        } else if (salary < 0){
            System.out.println("wrong input!");
        }
    }
}
