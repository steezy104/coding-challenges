package com.adidas;
import java.lang.Math;

public class AdidasAsciiLogo {

    public static String createAdidasAsciiLogo(int width) {
        if (width < 2)
            return "Error, minimum width is 2";
        String result = "";
        int height = (int)Math.ceil(Math.sqrt(width));
        int step = height; 
        
        for ( int h=0; h < height * 3; h++ ) {
            String line = "";
            
            for (int w=h+1; w < step; w++) {
                line += ' ';
            }
            
            if (h >= height) {
                for (int w=0; w < width; w++) {
                    line += ' ';
                }
            } else {
                for (int a=0; a < width; a++) {
                    line += '@';
                }
            }
            if (h >= height) {
                for (int w=h - height; w < step - 1; w++) {
                    line += ' ';
                }
            } else {
                for (int w=0; w < step; w++) {
                    line += ' ';
                }
            }
            
            if (h >= height * 2) {
                for (int w=0; w < width; w++) {
                    line += ' ';
                }
            } else {
                for (int a=0; a < width; a++) {
                    line += '@';
                }
            }
            
            if (h >= height * 2) {
                for (int w=h - height*2; w < step-1; w++) {
                    line += ' ';
                }
            } else {
                for (int w=0; w < step; w++) {
                    line += ' ';
                }
            }
            
            for (int a=0; a < width; a++) {
                line += '@';
            }
            line += '\n';
            result = line + result; // Add the line before so as to work from bottom up.
        }
        
        return result;
    }
}
