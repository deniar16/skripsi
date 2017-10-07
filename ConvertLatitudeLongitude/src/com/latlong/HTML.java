package com.latlong;

public class HTML {
    public static void main(String[] args) {
        int z = 1;
        for(int i = 0; i < 60; i++) {
            System.out.println("<tr class=\"map-row\">");
            for (int j = 0; j < 50; j++) {
                System.out.println("<td id="+z+" class=\"map-tile\"></td>");
                z++;
            }
            System.out.println("</tr>");
        }
    }
}
