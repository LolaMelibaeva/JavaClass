package com.class17;

public class MethodTaskArr {
public static void main(String[] args) {
	

	MethodTaskArr num1 = new MethodTaskArr();
	num1.maxAndMin(Integer.MIN_VALUE, 0, Integer.MAX_VALUE, 0);


}
	void maxAndMin(int max, int max2, int min, int min2) {
	int[] ary = { 100, 155, 200, 20, 9, -5 };

	for (int x = 0; x < ary.length; x++) {

		if (ary[x] > max) {
			max2 = max;
			max = ary[x];

		} else if (ary[x] > max2 && ary[x] != max) {
			max2 = ary[x];
		}
		if (ary[x] < min) {
			min2 = min;
			min = ary[x];
			
		} else if (ary[x] > min2 && ary[x] != min) {
			min2=ary[x];
		}

	}
	System.out.println("Array max number = " + max);
	System.out.println("Array max2 number = " + max2);
	System.out.println("Array min number = " + min);
	System.out.println("Array min2 number = " + min2);

}

}
