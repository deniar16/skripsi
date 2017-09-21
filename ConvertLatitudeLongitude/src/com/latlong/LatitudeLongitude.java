package com.latlong;

import java.text.DecimalFormat;

public class LatitudeLongitude {

	public static void main(String[] args) {
		double latitude = -6.18571012; 		double latitude2 = -6.18538347;
		double longitude = 106.83622397;	double longitude2 = 106.83667593;

		
		
		double latitude3 = -6.18594612;			double latitude4 = -6.18561679;
		double longitude3 = 106.83639798;		double longitude4 = 106.83685698;

		
		
		double tempLatKeKanan = latitude;
		double tempLatKeBawah = latitude;
		DecimalFormat numberFormat = new DecimalFormat("#.00000000");
/*		System.out.println((45196/30) + "asdfsad");
		System.out.println(numberFormat.format((longitude - longitude2)/30));
		System.out.println(numberFormat.format(longitude + 0.00001506));*/
		System.out.println("========================== Latitude =============================");
		StringBuilder sbLat = new StringBuilder();
		StringBuilder sbLong = new StringBuilder();
		int x = 1;

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 30; j++) {

				System.out.print(numberFormat.format(tempLatKeKanan) + ", ");
				sbLat.append("insert into map(id, latitude) values ("+x+", "+numberFormat.format(tempLatKeKanan)+");").append(System.getProperty("line.separator"));
				tempLatKeKanan = tempLatKeKanan + 0.00001088;
				x++;

			}
			System.out.println();
			tempLatKeBawah = tempLatKeBawah - 0.00002360;
			tempLatKeKanan = tempLatKeBawah;
		}

		double tempLongKeKanan = longitude;
		double tempLongKeBawah = longitude;
		System.out.println(numberFormat.format(longitude - longitude2));
		System.out.println(numberFormat.format(longitude + 0.00001740));
		System.out.println("========================== Longitude =============================");
		int z = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 30; j++) {

				System.out.print(numberFormat.format(tempLongKeKanan) + ", ");
				sbLong.append("update map set longitude="+numberFormat.format(tempLongKeKanan)+" where id="+z+";").append(System.getProperty("line.separator"));
				tempLongKeKanan = tempLongKeKanan + 0.00001506;

				z++;

			}
			System.out.println();
			tempLongKeBawah = tempLongKeBawah + 0.00001740;
			tempLongKeKanan = tempLongKeBawah;
		}

		System.out.println(sbLat.toString());
		System.out.println(sbLong.toString());

		/*for(int i = 0; i < 11; i++) {
			System.out.print(numberFormat.format(tempLatKeBawah) + ", ");
			for(int j = 0; j < 31; j++) {

				tempLatKeKanan = tempLatKeKanan + 0.00001088;
				System.out.print(numberFormat.format(tempLatKeKanan) + ", ");
				
			}
			System.out.println();
			tempLatKeBawah = tempLatKeBawah - 0.00002360;
			tempLatKeKanan = tempLatKeBawah;
		}
		
		double tempLongKeKanan = longitude;
		double tempLongKeBawah = longitude;
		System.out.println(numberFormat.format(longitude - longitude2));
		System.out.println(numberFormat.format(longitude + 0.00001740));
		System.out.println("========================== Longitude =============================");
		for(int i = 0; i < 11; i++) {
			System.out.print(numberFormat.format(tempLongKeBawah) + ", ");
			for(int j = 0; j < 31; j++) {

				tempLongKeKanan = tempLongKeKanan + 0.00001506;
				System.out.print(numberFormat.format(tempLongKeKanan) + ", ");
				
				
			}
			System.out.println();
			tempLongKeBawah = tempLongKeBawah + 0.00001740;
			tempLongKeKanan = tempLongKeBawah;
		}*/
	}

}
