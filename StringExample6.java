package Day12Book;

import java.util.StringJoiner;

public class StringExample6 {
	public static void main(String[] args) {
		String s="hello world";
		String ss=new String("hello world");
		
		StringJoiner joinstr=new StringJoiner(",");
		joinstr.setEmptyValue("its a empty string...");
		System.out.println(joinstr);
		joinstr.add("hello");
		joinstr.add("hai");
		System.out.println(joinstr);
		joinstr=new StringJoiner(",","[","]");
		joinstr.add("hello");
		joinstr.add("hai");
		System.out.println(joinstr);
		
		StringBuffer sbf=new StringBuffer();
		sbf.append("hello");
		StringBuilder sb=new StringBuilder();
		sb.append("hai");
		
	}
}
