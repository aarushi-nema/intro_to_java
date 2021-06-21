package Ch9;

import java.util.Date;


/**
 * ********************Account********************
 *
 * -id: int
 * -balance: double
 * -annualInterestRate: double
 * -date: Date
 *
 * -----------------------------------------
 * +Account()
 * +Account(id: int, balance: double)
 * +getID() :int
 * +setId(id: int)
 * +getBalance() :double
 * +setBalance(balance: double)
 * +getannualInterestRate(): double
 * +setannualInterestRate(annualInterestRate: double)
 * +getMonthlyInterestRate(): double
 * +getMonthlyInterest(): double
 * +withdraw(double amountToWithdraw)
 * +deopsit(double amountToDeposit)
 *
 */

public class Ex07Account {

    //Data fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //Constructors
    /** no-arg constructor that creates a default account */
    public Ex07Account(){
        id=0;
        balance=0;
        annualInterestRate=0;
        dateCreated= new Date();
    }

    /** constructor that creates an account with the specified id and initial balance.*/
    public Ex07Account(int id, double balance){
        this.id= id;
        this.balance= balance;
        dateCreated= new Date();
    }

    /**Accessor and mutator methods for id , balance , and annualInterestRate .*/
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance= balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate= annualInterestRate;
    }

    /**accessor method for dateCreated*/
    public Date getDateCreated(){
        return dateCreated;
    }

    /**method named getMonthlyInterestRate() that returns the monthly interest rate.*/
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    /**method named getMonthlyInterest() that returns the monthly interest.*/
    public double getMonthlyInterest(){
        return balance*(getMonthlyInterestRate()/100);
    }

    /**method named withdraw that withdraws a specified amount from the account.*/
    public void withdraw(double amountToWithdraw){
        balance-=amountToWithdraw;
    }

    /**method named deposit that deposits a specified amount to the account.*/
    public void deposit(double amountToDeposit){
        balance+=amountToDeposit;
    }
}
