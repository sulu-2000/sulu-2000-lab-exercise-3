package Day12Book;

public class StringExample5 {
	public static void main(String[] args) {
		String s1="HAARISINFOTECH";
		String s2="TRAINING DEPARTMENT";
		System.out.println("the concatention of two string is"+s1.concat(s2));
		System.out.println("the character at 7th place of string 2 is"+s2.charAt(7));
		System.out.println("the concatention of two string is"+s1.compareTo(s2));
		System.out.println("Boolean comparison ignoring case consideration"+s1.equalsIgnoreCase(s2));
		
		s1.equalsIgnoreCase(s2);
		System.out.println("hash code of string 2 is"+s2.hashCode());
		System.out.println("index of E in string 2 is "+s2.indexOf('e',3));
		System.out.println("index of E in string 2 from last is "+s2.lastIndexOf('e',16));
		System.out.println("length of string 2 is "+s2.length());
		System.out.println("after replacing e with k in string 1, string1="+s1.replace('H','P'));
		System.out.println("substring of string 2="+s2.substring(4));
		System.out.println("lower case of string 1 is="+s1.toLowerCase());
		System.out.println("upper case of string 1 is="+s2.toUpperCase());
		System.out.println("after trimming, string 2="+s2.trim());
		System.out.println();
	}
}
