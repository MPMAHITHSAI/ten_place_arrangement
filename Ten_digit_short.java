package Tendigitshort;

import java.util.Scanner;

public class Ten_digit_short {
    public static boolean arrange(int a, int b){
        int at = a/10;
        int bt = b/10;
        if(at==bt){
            if(a<b){
                return false;
            }else{
                return true;
            }
        }else if(at<bt){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (arrange(array[j],array[i])) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}