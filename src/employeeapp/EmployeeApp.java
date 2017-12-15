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
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Employee Id," + "Employee Name," + "Salaried or hourly," + "weekly pay");
        FullTimeEmployee ft = new FullTimeEmployee("Rohit", 12, 40000);
        System.out.println(ft.toString());

        HourlyEmployee hr = new HourlyEmployee("Ekta", 15, 50);
//        hr.computeWeeklyPay();
        System.out.println(hr.toString());
    }

}
