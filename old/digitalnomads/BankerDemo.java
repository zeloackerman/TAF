package com.digitalnomads;

public class BankerDemo {

    public static void main(String[] args) throws Exception {

        DemirBank ataiDemirAccount = new DemirBank(123456789111l,111111111l);
        ataiDemirAccount.deposit(1000);
        System.out.println(ataiDemirAccount.getBalance());

        DemirBank nurazizDemirAccount = new DemirBank(111111111111l,222222222l);
        nurazizDemirAccount.deposit(2000);
        System.out.println(nurazizDemirAccount.getBalance());

        Bank.transferFunds(nurazizDemirAccount,ataiDemirAccount,500);

        System.out.println(ataiDemirAccount.getBalance());
        System.out.println(nurazizDemirAccount.getBalance());
        System.out.println("---------------");



        KICB pirjanKICBAccount = new KICB(111111111111l, 222222222l);
        pirjanKICBAccount.deposit(5000);
        Bank.transferFunds(pirjanKICBAccount, ataiDemirAccount,5000);
        System.out.println(pirjanKICBAccount.getBalance());
        System.out.println(ataiDemirAccount.getBalance());

        System.out.println("---------------");

        Bank.transferFunds(pirjanKICBAccount, nurazizDemirAccount,700);
        System.out.println(nurazizDemirAccount.getBalance());

        Kyrgyzstan pirjanKGAccout = new Kyrgyzstan(222222222222l, 334333333l);



        }
    }

