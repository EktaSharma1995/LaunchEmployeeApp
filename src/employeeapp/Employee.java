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
public class Employee {

    private String employeeName;
    private int employeeId;
    private String employeeType;
    private double weeklyPay;

    public Employee() {
    }

    public Employee(String employeeName, int employeeId) {
        this.setName(employeeName);
        this.setEmployeeId(employeeId);
    }

    public Employee(String employeeName, int employeeId, String employeeType) {
        this.setName(employeeName);
        this.setEmployeeId(employeeId);
        this.setEmployeeType(employeeType);
    }
    
    public String getName() {
        return employeeName;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public void computeWeeklyPay() {
        System.out.println("Un-implemented method");
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    @Override
    public String toString() {
        return  employeeId + "," + employeeName + ", " + employeeType + ", " + weeklyPay;
    }

}
