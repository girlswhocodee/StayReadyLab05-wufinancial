package com.codedifferently.stayready;

public class CurrencyConversions {

    public static void main(String[] args){
         //System.out.println(euroToBritishPound(1346));
        
    }

    public Double dollarToEuro(double input) {
        double euro = input * 0.94;
        return euro;
        //System.out.println(dollarToEuro(56));
    }

    public Double euroToDollar(double input){
        double dollar = input * (1.00/0.94);
        return dollar;
        //System.out.println(euroToDollar(200));
    }

    public Double euroToBritishPound(double input){
        double britishPound = input * (0.82/0.94);
        return britishPound;
    }
    public Double britishPoundToIndianRupee(double input){
        double indianRupee = input * (68.32/0.82);
        return indianRupee;
        //System.out.println(britishPoundToIndianRupee(11));
    }
    public Double rupeeToCanadianDollar(double input){
        double canadianDollar = input * (1.32/68.32);
        return canadianDollar;
    }
    public Double singaporeDollarToSwissFranc(double input){
        double swissFranc = input * (1.01/1.43);
        return swissFranc;
    }
    public Double swissFrancToMalaysianRinggit(double input){
        double malaysianRinggit = input * (4.47/1.01);
        return malaysianRinggit;
    }
    public Double malaysianRinggitToJapaneseYen(double input){
        double japaneseYen = input * (115.84/4.47);
        return japaneseYen;
    }
    public Double japaneseYenToChineseYuanRenminbi(double input){
        double chineseYuanRenminbi = input * (6.92/115.84);
        return chineseYuanRenminbi;
    }
}