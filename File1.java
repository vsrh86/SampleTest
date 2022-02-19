package com.sss.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckDuplicate {
public static void main(String[] args) {
	int num[]= {13,33,13,23,54,65};
	//Using hashset Method
	HashSet uniqueelements= new HashSet();
	Set s=Arrays.stream(num).filter(i->!uniqueelements.add(i)).boxed()
	.collect(Collectors.toSet());
	System.out.println(s);
	
//	Map hm= new HashMap(l);
	
	
	
			}
}
