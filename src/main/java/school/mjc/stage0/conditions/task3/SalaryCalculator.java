package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double calculatedSalary = 0;
        if (salary <= 0) {
            System.out.println("wrong input!");
        }
        if(salary > 0 && salary <= 10000){
            calculatedSalary = salary - (salary * 15 / 100);
            System.out.println(calculatedSalary);
        }
        if(salary > 10000 && salary<=20000){
            calculatedSalary = salary - (salary * 18 / 100);
            System.out.println(calculatedSalary);
        }
        if(salary > 20000){
            calculatedSalary = salary - (salary * 20 / 100);
            System.out.println(calculatedSalary);
        }
    }
}
