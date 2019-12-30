package com.zengyin.practice20180108;

public class Range {
	public static int[] range(int n){
		int[] result = new int[n];
		for(int i = 0 ; i<n;i++){
			result[i] = i;
		}
		return result;
		
	}
	public static int[] reange(int start , int end){
		int size = end -start;
		int[] result =new int[size];
		for(int i = 0 ; i<size;i++){
			result[i] = start+i;
		}
		return result;
	}
	public static int[] reange(int start , int end ,int step){
		int size = (end - start)/step;
		int[] result = new int[size];
		for(int i = 0 ; i<size;i++){
			result[i] = start+(i*step);
		}
		return result;
	}
}
