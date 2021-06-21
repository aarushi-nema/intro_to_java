package Ch9;

/**
 * Q: Design a class named Account that contains:
 o A private int data field named id for the account (default 0 ).
 o A private double data field named balance for the account (default 0 ).
 o A private double data field named annualInterestRate that stores the
 current interest rate (default 0 ). Assume that all accounts have the
 same interest rate.
 o A private Date data field named dateCreated that stores the date when
 the account was created.
 o A no-arg constructor that creates a default account.
 o A constructor that creates an account with the specified id and initial
 balance.
 o The accessor and mutator methods for id , balance , and
 annualInterestRate .
 o The accessor method for dateCreated .
 o A method named getMonthlyInterestRate() that returns the monthly
 interest rate.
 o A method named getMonthlyInterest() that returns the monthly
 interest.
 o A method named withdraw that withdraws a specified amount from
 the account.o
 A method named deposit that deposits a specified amount to the
 account.
 Draw the UML diagram for the class then implement the class. (Hint: The
 method getMonthlyInterest() is to return monthly interest, not the
 interest rate. Monthly interest is balance * monthlyInterestRate .
 monthlyInterestRate is annualInterestRate / 12 . Note
 annualInterestRate is a percentage, for example 4.5%. You need to divide
 it by 100.)
 Write a test program that creates an Account object with an account ID of
 1122, a balance of $20,000, and an annual interest rate of 4.5%. Use the
 withdraw method to withdraw $2,500, use the deposit method to deposit
 $3,000, and print the balance, the monthly interest, and the date when this
 account was created.

 * Created by aarushi on 19/6/21.
 */

public class Ex07AccountTest {

    public static void main (String [] args){
        Ex07Account obj= new Ex07Account(1122, 20000);
        obj.setAnnualInterestRate(4.5);
        obj.withdraw(2500);
        obj.deposit(3000);
        System.out.println("Balance: " + obj.getBalance());
        System.out.println("Monthly Interest: " + obj.getMonthlyInterest());
        System.out.println("Date account was created: " + obj.getDateCreated());
    }
}
