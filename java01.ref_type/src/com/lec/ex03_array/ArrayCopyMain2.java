package com.lec.ex03_array;

import java.util.Arrays;

public class ArrayCopyMain2 {

	public static void main(String[] args) {
		String[][] names = {{"소향", "나얼"},{"손흥민", "이강인", "김민재"}}; 
		
		// 깊은 복사(1) - for문
		String[][] names1 = new String[2][];
		names1[0] = new String[2];
		names1[1] = new String[3];
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				names1[i][j] = names[i][j];
			}
		}
		names[0][0] = "거미";
		names[1][2] = "황희찬";		
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("names[" + i + "][" + j + "] = " + names[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0;i<names1.length;i++) {
			for(int j=0;j<names1[i].length;j++) {
				System.out.println("names1[" + i + "][" + j + "] = " + names1[i][j]);
			}
		}
		System.out.println();
		
		// 깊은 복사(2) - System.arraycopy(old, old시작, new, new시작, old크기)
		String[] old1 = {"소향", "거미", "나얼"};
		String[] new1 = new String[6];
		System.arraycopy(old1, 0, new1, 0, old1.length);
		System.out.println(old1.hashCode() + " : " + new1.hashCode());
		
		for(int i=0;i<old1.length;i++) {
			System.out.println(old1[i].hashCode() + " : " + new1[i].hashCode());
		}
		System.out.println();
		
		old1[0] = "박정현";
		for(int i=0;i<old1.length;i++) {
			System.out.println(old1[i].hashCode() + " : " + new1[i].hashCode());
		}		
		System.out.println("----------------------------------");
		
		// 깊은 복사(3) - Arrays.copyOf(src, new.length)
		String[] new2 = Arrays.copyOf(old1, 3);
		System.out.println(old1.hashCode() + " : " + new2.hashCode());
		for(int i=0;i<old1.length;i++) {
			System.out.println(old1[i].hashCode() + " : " + new2[i].hashCode());
		}		
		System.out.println("----------------------------------");
		
		// 깊은 복사(4) - Arrays.copyOfRange(src, start, end-1)
		String[] new4 = Arrays.copyOfRange(old1, 0, 3);
		System.out.println(old1.hashCode() + " : " + new4.hashCode());
		for(int i=0;i<old1.length;i++) {
			System.out.println(old1[i].hashCode() + " : " + new4[i].hashCode());
		}			
		
	}

}
