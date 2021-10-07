package org.lisamp;

import java.util.LinkedList;
import java.util.List;

public class SamLis {
	public static void main(String[] args) {
List<Object> l = new LinkedList<Object>();
l.add("test");
l.add(15);
l.add(25);
for(int i =0; i<l.size(); i++)
{
	System.out.println(l.get(i));
}
}
}

