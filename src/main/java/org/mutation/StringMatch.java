package org.mutation;

public class StringMatch {
    public int repeatedStringMatch(String a, String b) {
        if(a.length()==0 || b.length()==0)
            return -1;
        String copy = "";
        int count=0;
        while(copy.length()<b.length()){
            copy+=a;
            count++;
        }
        if(copy.indexOf(b)>=0)
            return count;
        if((copy+a).indexOf(b)>=0)
            return ++count;
        return -1;
    }
    }

