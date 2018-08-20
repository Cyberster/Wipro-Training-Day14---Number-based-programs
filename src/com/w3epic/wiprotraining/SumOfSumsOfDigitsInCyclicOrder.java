package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class SumOfSumsOfDigitsInCyclicOrder {

	public int sumOfSumsOfDigits(int input1){
		// Read only region end
		String num = String.valueOf(input1);
		int sum = 0;
		
		for (int i = 0; i < num.length(); i++) {
			for (int j = i; j < num.length(); j++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
			}
		}
		
		return sum;
	}
}