package com.latlong;

import java.text.DecimalFormat;

public class Hitung
{
    public static void main(String[] args){
        double latitude = -6.208907; 		double latitude2 = -6.208896;
        double longitude = 106.737697;		double longitude2 = 106.739529;



        double latitude3 = -6.210872;			double latitude4 = -6.210901;
        double longitude3 = 106.737663;		double longitude4 = 106.739533;

        DecimalFormat numberFormat = new DecimalFormat("#.00000000");
        System.out.println(numberFormat.format((latitude - latitude2) / 50));
        System.out.println(numberFormat.format((longitude - longitude2) / 50));

        System.out.println(numberFormat.format((latitude - latitude3)/60));
        System.out.println(numberFormat.format((longitude - longitude3) / 60));
    }
}
