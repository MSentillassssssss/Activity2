
package com.mycompany.act2;

import java.util.Random;

public class Act2 {

    public static void main(String[] args) {
int[]cyann = {500, 70, 550, 55, 300, 599};
        int rnd = new
        Random ().nextInt(cyann.length);
        
        int max = Math.max(cyann[0], cyann[1]);
        int max1 = Math.max(Math.max(cyann[0], cyann[2]), cyann[1]);
        int max2 = Math.max(cyann[0], Math.max(cyann[2], Math.max(cyann[3],
                Math.max(cyann[4], cyann[5]))));
        int min = Math.min (cyann [0], cyann[1]);
        int min1 = Math.min(Math.min(cyann[0], cyann[2]), cyann[1]);
        int min2 = Math.min(cyann[0], Math.min(cyann[2], Math.min(cyann[3],
                Math.min(cyann[4], cyann[5]))));
        int cyann_sum = cyann[0] + cyann [1] + cyann [2] + cyann [3] + cyann [4] +
                cyann [5] ;
        
        
        System.out.println("Elements of the array: 500, "+" 70, "+" 550, "+" 55,"+" 300, "+" 599");
        System.out.println("Maximum Value: " + max);
        System.out.println("Maximum 1 Value: " + max1);
        System.out.println("Maximum 2 Value: " + max2);
        System.out.println("Minimum Value: " + min);
        System.out.println("Minimum 1 Value: " + min1);
        System.out.println("Minimum 2 Value: " + min2);
        System.out.println("Random Value: " + cyann[rnd]);
        System.out.println("Total of All Value: " + cyann_sum);
        
                
}
}
