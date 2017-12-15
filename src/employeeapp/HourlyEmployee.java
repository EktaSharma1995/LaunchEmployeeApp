/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.Scanner;

/**
 *
 * @author ektasharma
 */
public class HourlyEmployee extends Employee {

    double hourlyRate;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String employeeName, int employeeId, double hourlyRate) {
        super(employeeName, employeeId, "HOURLY");
        this.hourlyRate = hourlyRate;
        this.computeWeeklyPay();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void computeWeeklyPay() {
        double weeklyPay = 40 * this.hourlyRate;
//        System.out.println("weekly pay is: " + weeklyPay);
        super.setWeeklyPay(weeklyPay);
    }

}
