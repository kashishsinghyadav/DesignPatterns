package com.example;

public class GovtUniversity extends abstractuniversity{
    @Override
    public GetAdmit getAdmitcard (String course ){
            switch (course) {
                case "Aerospace":
                return new AerospaceAdmitcard();
                    
                case "Computer Science":
                return new ComputerScienceAdmitCard();
            default:
                    break;
            }
            return null; 

    }
@Override
public  GetFee getfees(String course){
   
    switch (course) {
        case "Aerospace":
            return new AerospaceFees();
        case "Computer Science":
            return new ComputerScienceFees();
        default:
            throw new UnsupportedOperationException("Fees for course " + course + " are not supported");
    }


}

}
