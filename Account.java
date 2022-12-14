//This program is created by Aryaan Rabara 21CE112
//Github Link:-https://github.com/21CE112/21CE112_PRAC_ASSIGNMENT.git
import java.util.*;
class Account
{
    private static int ID=0;
    private double balance;
    private double annualInterestRate=7;
    private Date date;
//here we use getter setter
    public static int getID() {
        
        return ID;
        
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
//here we use Default constructor
    public Account()
    {
        ID = 0;
        balance = 0;
        annualInterestRate = 0;
    }
//here we use paramiterrized constructor
    public Account(int id,double b)
    {
        ID = id;
        balance = b;
    }
//here we make some methods for application
    public double getMonthlyInterestRate()
    {
        return ((float)annualInterestRate/12);
    }

    public double getMonthlyInterest()
    {
        return ((float)annualInterestRate/100)/12;
    }
    
    public void withdraw(double a)
    {
        balance-=a;
        System.out.println("Your current balance is:-"+balance);
    }

    public String toString()
    {
        Date d = new Date();
        System.out.println(d);
        setDate(d);
        return ("Account id is :- " + getID() + "\nYour Balance is:- " + getBalance() + "\n Account created on date:- " + d + "\nMonthly Interest is:-  "+getMonthlyInterest());
    }
}