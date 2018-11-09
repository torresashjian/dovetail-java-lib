package com.tibco.dovetail.core.runtime.function;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class string {
    public static String concat(Object ...arg){
        return Arrays.asList(arg).stream().map(it -> it.toString()).collect(Collectors.joining());
    }
    
    public static String concatWithDelimiter(String delimiter, Collection<Object> arg2){
        return arg2.stream().map(it -> it.toString()).collect(Collectors.joining(delimiter));
    }
    
    public static String[] split(String str, String delimiter){
        String[] tokens = str.split(delimiter);
        for(int i=0; i<tokens.length; i++) {
        		tokens[i] = tokens[i].trim();
        }
        
        return tokens;
    }
}