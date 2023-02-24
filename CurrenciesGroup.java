package homeWork;

import java.util.Scanner;

public class CurrenciesGroup {
    
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter the amount you wish to exchange: ");
        double usCurrency = scr.nextFloat();
        System.out.println("Please choose which Country you would like to exchange to: ");
        System.out.println("Europe, Nigeria, Canada, and Japan...");
        String typeCurrency = scr.next();
        String euro = "Europe";
        String naira = "Nigeria";
        String canadian = "Canada";
        String yen = "Japan";
        
        
        if (typeCurrency.equals(euro)) {
            euConversion(usCurrency);
        } else if (typeCurrency.equals(naira)) {
            nairaConversion(usCurrency);
        } else if (typeCurrency.equals(canadian)) {
            canadianDollarC(usCurrency);
        } else if (typeCurrency.equals(yen)) {
            yenConversion(usCurrency);
        } else {
            System.out.println("Please make sure you spell the country correctly. Thank you for your understanding.");
        }
        scr.close();
    }

    private static void euConversion(double usCurrency) {

        double euExchangeRate = .94f;
        double euEquation = euExchangeRate * usCurrency;
        double euCurrency = Math.round(euEquation * 100.00) / 100.00;
        System.out.println("Amount in Europe: " + euCurrency + ".");
        

    }

    private static void nairaConversion(double usCurrency) {

        double nairaExchangeRate = 460.47f;
        double nairaEquation = nairaExchangeRate * usCurrency;
        double nairaCurrency = Math.round(nairaEquation * 100.00) / 100.00;
        System.out.println("Amount in Nigeria: " + nairaCurrency + ".");

    }

    private static void canadianDollarC(double usCurrency)  {

        double canadianDExchangeRate = 1.36f;
        double canadianDEquation = canadianDExchangeRate * usCurrency;
        double canadianDCurrency = Math.round(canadianDEquation * 100.00) / 100.00;
        System.out.println("Amount in Canada: " + canadianDCurrency + ".");

    }
        
    private static void yenConversion(double usCurrency) {

        double yenExchangeRate = 134.96f;
        double yenEquation = yenExchangeRate * usCurrency;
        double yenCurrency = Math.round(yenEquation * 100.00) / 100.00;
        System.out.println("Amount in Japan: " + yenCurrency + ".");

    }

}
