package com.lgcns.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthlySalary = 1000000;
		
		int annualSalary = monthlySalary * 12;
		
		double quarterlyBonus = monthlySalary * 0.2;
		
		double annualBonus = quarterlyBonus * 4;
		
		double salaryTax = annualSalary * 0.10; 
		
        double bonusTax = annualBonus * 0.055; 
        
        double salaryAfterTax = annualSalary - salaryTax;
        
        double bonusAfterTax = annualBonus - bonusTax;
        
        double totalPaymentAfterTax = salaryAfterTax + bonusAfterTax;
        
        System.out.printf("Salary: %d, Salary after Tax: %.0f%n", annualSalary, salaryAfterTax);
        System.out.printf("Bonus: %.0f, bonus after Tax: %.0f%n", annualBonus, bonusAfterTax);
        System.out.printf("Payment: %.0f%n", totalPaymentAfterTax);
	}

}
