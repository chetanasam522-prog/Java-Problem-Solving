/**  # Problem Statement:-Calculate income tax paid by an empbyee to the government as per the slabs mentioned belows:
                        Income Slab        Tax
                         2.5L-50L          5%
                         5.01-100L         20%
                         Above 10.01       30%
                         Note that there is no tax below 2.51. Take imput amount as an input from the user.
.
 # Logic: Income Tax Calculator

. The program begins by creating a Scanner object to take the annual income of an employee from the user.
. A variable tax is initialized to 0 to store the calculated income tax.
. The program checks the income using conditional statements based on predefined tax slabs.
. If the income is up to ₹2.5 lakh, no tax is applied.
. If the income lies between ₹2.5 lakh and ₹5 lakh, tax is calculated at 5% only on the amount exceeding ₹2.5 lakh.
. If the income lies between ₹5 lakh and ₹10 lakh, tax is calculated as:
. 5% on the first ₹2.5 lakh (₹2.5L–₹5L), and
. 20% on the remaining amount above ₹5 lakh.
. If the income is above ₹10 lakh, tax is calculated as:
  5% on ₹2.5L–₹5L,
  20% on ₹5L–₹10L, and
  30% on the amount exceeding ₹10 lakh.
. The calculated tax from all applicable slabs is added together.
. Finally, the program displays the total income tax payable by the employee.

 # Time & Space Complexity
 . Time Complexity = O(n)
 . Space Complexity = O(n)

 # Solution:- **/

import java.util.*;
public class IncomeTaxCalculator{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        float income = sc.nextFloat();

        float tax = 0;

        // Tax calculation 
        if (income <= 250000) {
            tax = 0;
        } 
        else if (income <= 500000) {
            tax = (income - 250000) * 0.05f;
        } 
        else if (income <= 1000000) {
            tax = (250000 * 0.05f) 
                + (income - 500000) * 0.20f;
        } 
        else {
            tax = (250000 * 0.05f) 
                + (500000 * 0.20f) 
                + (income - 1000000) * 0.30f;
        }

        System.out.println("Income Tax to be paid:" + tax);

    }

}

     
