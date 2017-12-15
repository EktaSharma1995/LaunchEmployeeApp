/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author ektasharma
 */
public class FullTimeEmployee extends Employee {

    private double annualSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String employeeName, int employeeId, double annualSalary) {
        super(employeeName, employeeId, "SALARIED");
        this.setAnnualSalary(annualSalary);
        this.computeWeeklyPay();
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public void computeWeeklyPay() {
        double annualSalary = getAnnualSalary();
        double weeklyPay = annualSalary / 52;
//        System.out.println("Weekly salary is: " + weeklyPay);
        super.setWeeklyPay(weeklyPay);
    }

}
