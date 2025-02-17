package com.example;

public class Main {
    public static void main(String[] args) {
        int score=250;
        abstractuniversity university = abstractuniversity.getUniversity(score);
        GetAdmit admit = university.getAdmitcard("Aerospace");
        System.out.println(admit.Admitcard());
        GetFee Fees = university.getfees("Aerospace");
        System.out.println(Fees.aeroFeeCalculator());
        GetAdmit admit1 = university.getAdmitcard("Computer Science");
        System.out.println(admit1.Admitcard());
        int score1=120;
        abstractuniversity university1 = abstractuniversity.getUniversity(score1);
        GetAdmit admit2 = university1.getAdmitcard("Aerospace");
        System.out.println(admit2.Admitcard());
        GetFee Fees2 = university1.getfees("Aerospace");
        System.out.println(Fees2.aeroFeeCalculator());
        GetAdmit admit3 = university1.getAdmitcard("Computer Science");
        System.out.println(admit3.Admitcard());


        
    }
}