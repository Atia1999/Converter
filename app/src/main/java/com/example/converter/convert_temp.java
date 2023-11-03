package com.example.converter;

public class convert_temp {
    public static double C2toF(double C){
        C=((C*9)/5)+32;
        return C;
    }
    public static double F2toC(double F){
       F=((F-32)*5)/9;
        return F;
    }
    public static double M2toI(double M){
        M=M*39.37;
        return M;
    }
    public static double I2roM(double In){
        In=In/39.37;
        return In;
    }
    public static double usdBDT(double usdB){
        usdB=usdB*107;
        return usdB;
    }
    public static double bdtUSD(double bdtU){
        bdtU=bdtU/107;
        return bdtU;
    }
    public static double inrUSD(double inrU){
        inrU=inrU/82;
        return inrU;
    }
}
