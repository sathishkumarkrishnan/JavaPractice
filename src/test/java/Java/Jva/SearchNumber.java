package Java.Jva;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class SearchNumber {
	public static void main(String[] args) {
		Set<Integer> set =  new HashSet<Integer>();
		int[] a= {-5,2,3,6};
		int lastIndexVal= a[a.length-1];
		int firstIndexVal=a[0];
		for(int i=firstIndexVal;i<=lastIndexVal;i++)
		{
			set.add(i);
		}
	
		for(int j=0;j<a.length;j++)
		{
			set.remove(a[j]);
		}
		List<Integer> list = new ArrayList<Integer>(set); 
		Collections.sort(list);
		System.out.println(list);
		}
	
		}

	

