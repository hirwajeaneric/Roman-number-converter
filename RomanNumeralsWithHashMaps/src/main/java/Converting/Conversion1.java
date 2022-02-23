package Converting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conversion1 {
    //Creating hashMap
    static Map<Integer,Numerals> theNumbers = new HashMap<Integer,Numerals>();
    static String arabicNumber = "543";
    static String romanNumber = "MCMXCVIII";

    //Main function
    public static void main(String[] args) {
        createNumberSystem();
        convertToRoman(arabicNumber);
        convertToArabic(romanNumber);
    }

    //Method to convert into Roman
    public static void convertToRoman(String arabicNumber){
        String answer = "";
        List<String> theAnswer=new ArrayList<String>();
        String numberToSearch;
        for (int i = 0; i < arabicNumber.length(); i++) {
            String aDigit = String.valueOf(arabicNumber.charAt(i));
            //System.out.println("The number to be converted: "+aDigit);

            if (arabicNumber.length() == 4 && i==0){
                numberToSearch = aDigit.concat("000");
                //System.out.println("The number to be searched for: "+numberToSearch);
                for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())){
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: "+num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 4 && i==1){
                numberToSearch = aDigit.concat("00");
                //System.out.println("The number to be searched for: "+numberToSearch);
                for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())){
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: "+num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 4 && i==2){
                numberToSearch = aDigit.concat("0");
                //System.out.println("The number to be searched for: "+numberToSearch);
                for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())){
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: "+num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 4 && i==3){
                numberToSearch = aDigit.concat("");
                //System.out.println("The number to be searched for: "+numberToSearch);
                for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())){
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: "+num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 3 && i==0) {
                numberToSearch = aDigit.concat("00");
                //System.out.println("The number to be searched for: " + numberToSearch);
                for (Map.Entry<Integer, Numerals> entries : theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())) {
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: " + num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 3 && i==1) {
                numberToSearch = aDigit.concat("0");
                //System.out.println("The number to be searched for: " + numberToSearch);
                for (Map.Entry<Integer, Numerals> entries : theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())) {
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: " + num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 3 && i==2) {
                numberToSearch = aDigit.concat("");
                //System.out.println("The number to be searched for: " + numberToSearch);
                for (Map.Entry<Integer, Numerals> entries : theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())) {
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: " + num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 2 && i==0) {
                numberToSearch = aDigit.concat("0");
                //System.out.println("The number to be searched for: " + numberToSearch);
                for (Map.Entry<Integer, Numerals> entries : theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())) {
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: " + num.getRoman());
                    }
                }
            }else if(arabicNumber.length() == 2 && i==1) {
                numberToSearch = aDigit.concat("");
                //System.out.println("The number to be searched for: " + numberToSearch);
                for (Map.Entry<Integer, Numerals> entries : theNumbers.entrySet()) {
                    Numerals num = entries.getValue();
                    if (numberToSearch.equals(num.getArabic())) {
                        theAnswer.add(num.getRoman());
                        //System.out.println("Number found: " + num.getRoman());
                    }
                }
            }
        }
        System.out.print("\nThe equivalent of "+arabicNumber+" in Roman numbers is: ");
        for (int i = 0; i < arabicNumber.length(); i++) {
            System.out.print(theAnswer.get(i));
        }
        System.out.println("\n\n-----------------------------------------------------------");
    }

    //Method to convert into Arabic
    public static void convertToArabic(String romanNumber){
        System.out.println("The roman number to convert is: "+romanNumber);
        List<String> theSecondAnswer = new ArrayList<String>();
        System.out.println(romanNumber.substring(6,9));
        System.out.println(romanNumber.substring(6,8));
        System.out.println(romanNumber.substring(6,7));
        System.out.println(romanNumber.substring(3,6));
        System.out.println(romanNumber.substring(3,5));
        System.out.println(romanNumber.substring(3,4));
        System.out.println(romanNumber.substring(0,3));
        System.out.println(romanNumber.substring(0,2));
        System.out.println(romanNumber.substring(0,1));
        /*
        for (int i = 0; i < romanNumber.length(); i++) {
            for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
                Numerals num = entries.getValue();
                if (romanNumber.substring(0,2).equals(num.getRoman())){
                    theSecondAnswer.add(num.getArabic());
                    System.out.println("Number found: "+num.getArabic());
                    System.out.print(romanNumber.substring(0,2));
                    //romanNumber = romanNumber.substring(3);
                }else if (romanNumber.substring(0,1).equals(num.getRoman())){
                    theSecondAnswer.add(num.getArabic());
                    System.out.println("Number found: "+num.getArabic());
                    System.out.print(romanNumber.substring(0,1));
                    //romanNumber = romanNumber.substring(2);
                }else if(romanNumber.substring(0).equals(num.getRoman())){
                    theSecondAnswer.add(num.getArabic());
                    System.out.println("Number found: "+num.getArabic());
                    System.out.print(romanNumber.substring(0));
                    //romanNumber = romanNumber.substring(1);
                }
            }
        }*/
        /*
        System.out.println("The fore answer: ");
        for (int i = 0; i < romanNumber.length(); i++) {
            System.out.print(theSecondAnswer.get(i)+" ");
        }*/
    }

    public static void createNumberSystem(){
        //Adding Numerals
        Numerals num1 = new Numerals("1","I");
        Numerals num2 = new Numerals("2","II");
        Numerals num3 = new Numerals("3","III");
        Numerals num4 = new Numerals("4","IV");
        Numerals num5 = new Numerals("5","V");
        Numerals num6 = new Numerals("6","VI");
        Numerals num7 = new Numerals("7","VII");
        Numerals num8 = new Numerals("8","VIII");
        Numerals num9 = new Numerals("9","IX");
        Numerals num10 = new Numerals("10","X");
        Numerals num20 = new Numerals("20","XX");
        Numerals num30 = new Numerals("30","XXX");
        Numerals num40 = new Numerals("40","XL");
        Numerals num50 = new Numerals("50","L");
        Numerals num60 = new Numerals("60","LX");
        Numerals num70 = new Numerals("70","LXX");
        Numerals num80 = new Numerals("80","LXXX");
        Numerals num90 = new Numerals("90","XC");
        Numerals num100 = new Numerals("100","C");
        Numerals num200 = new Numerals("200","CC");
        Numerals num300 = new Numerals("300","CCC");
        Numerals num400 = new Numerals("400","CD");
        Numerals num500 = new Numerals("500","D");
        Numerals num600 = new Numerals("600","DC");
        Numerals num700 = new Numerals("700","DCC");
        Numerals num800 = new Numerals("800","DCCC");
        Numerals num900 = new Numerals("900","CM");
        Numerals num1000 = new Numerals("1000","M");
        Numerals num2000 = new Numerals("2000","MM");
        Numerals num3000 = new Numerals("3000","MMM");

        //Adding numbers to the map
        theNumbers.put(1,num1);
        theNumbers.put(2,num2);
        theNumbers.put(3,num3);
        theNumbers.put(4,num4);
        theNumbers.put(5,num5);
        theNumbers.put(6,num6);
        theNumbers.put(7,num7);
        theNumbers.put(8,num8);
        theNumbers.put(9,num9);
        theNumbers.put(10,num10);
        theNumbers.put(20,num20);
        theNumbers.put(30,num30);
        theNumbers.put(40,num40);
        theNumbers.put(50,num50);
        theNumbers.put(60,num60);
        theNumbers.put(70,num70);
        theNumbers.put(80,num80);
        theNumbers.put(90,num90);
        theNumbers.put(100,num100);
        theNumbers.put(200,num200);
        theNumbers.put(300,num300);
        theNumbers.put(400,num400);
        theNumbers.put(500,num500);
        theNumbers.put(600,num600);
        theNumbers.put(700,num700);
        theNumbers.put(800,num800);
        theNumbers.put(900,num900);
        theNumbers.put(1000,num1000);
        theNumbers.put(2000,num2000);
        theNumbers.put(3000,num3000);

        //Traversing the map
        /*
        for (Map.Entry<Integer,Numerals> entries: theNumbers.entrySet()) {
            Numerals num = entries.getValue();
            System.out.println(num.getArabic()+" -> "+num.getRoman());
        }*/
    }

}
