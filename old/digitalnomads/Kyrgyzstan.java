package com.digitalnomads;

public class Kyrgyzstan extends BankBase{

    private double balance = 300;

    public Kyrgyzstan(long accountNumber, long routingNUmber) throws Exception {
        super(accountNumber, routingNUmber);
    }

    @Override
    public double getBalance() {
        return balance ;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 20000){
            System.err.println("Invalid amount, can not be deposited");
        }else{
            balance += amount;
        }
    }

    @Override
    public void withDraw(double amount) throws Exception {
        if (amount < 0 || amount > 5000){
            throw new Exception ("Invalid amount, can not be withdrawn");
        }else {
            if (balance < amount){
                throw new Exception("Insufficient funds");
            }
            else {
                balance -= amount;
            }
        }
    }
    }

