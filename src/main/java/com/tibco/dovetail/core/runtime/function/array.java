package com.tibco.dovetail.core.runtime.function;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class array {
	public static int size(Collection<Object> col) {
		if(col == null)
			return 0;
		else
			return col.size();
	}
	
	public static void createItem() {
		
	}
	
	public static Set<String> distinct(Collection<Object> col) {
		HashSet<String> set = new HashSet<String>();
		col.forEach(c -> set.add(c.toString()));
		return set;
	}
}