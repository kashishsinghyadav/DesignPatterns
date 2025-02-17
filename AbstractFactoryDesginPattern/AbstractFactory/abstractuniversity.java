package com.example;

public abstract class abstractuniversity {

    public static abstractuniversity getUniversity(int score){
            if(score>180){
                return new GovtUniversity();
            }
            else if(score>90){
                return  new PvtUniversity();
            }
            else{
                return null;
            }
    }
    public abstract GetAdmit getAdmitcard(String course);
    public abstract GetFee getfees(String course );
}
