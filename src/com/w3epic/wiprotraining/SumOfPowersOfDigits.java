package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class SumOfPowersOfDigits {

	public int sumOfPowerOfDigits(int input1){
		// Read only region end
		if (input1 <= 9) return 0;
		
		String num = String.valueOf(input1);
		int sum = 0;
		System.out.println(num);
		
		for (int i = 0; i < num.length(); i++) {
			if (i == num.length() - 1) {
				sum += 1;
				System.out.println(num.charAt(i) + " ^ " + 0);
			} else {
				//sum += Math.pow(input1 % 100 / 100, input1 % 10);
				//System.out.println(((input1 % 100) / 100) + " :: " + (input1 % 10));
				//input1 /= 10;
				sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(i))), Integer.parseInt(String.valueOf(num.charAt(i + 1))));
                //System.out.println(num.charAt(i) + " ^ " + num.charAt(i + 1));
			}
		}
		
		return sum;
	}
}