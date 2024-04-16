/*Q)Write a program to illustrate the following string manipulation methods 
   1)create a new string using new operator
   2)get in string length 
   3)string conctatanation
   4)character extraction
   5)string comparison
   6)searching substring
   7)modifying string
   8)data conversion using valueOf() method
*/

import java.util.*;
class strManipulation{
public static void main(String[] args){
char chs[]={'W','E','L','C','O','M','E'};
String newStr=new String(chs);
System.out.println("New string from chr[] using new string:"+newStr);
String s1="Good";
String s2="Morning";
System.out.print("\n\nstring 1 :"+s1);
System.out.print("\nstring 2 :"+s2);
System.out.print("\n\nlength of string 'good' :"+s1.length());
System.out.print("\n\n"+s1+" to uppercase :"+s1.toUpperCase());
System.out.print("\n\n"+s2+" to lowercase :"+s2.toLowerCase());
System.out.print("\n\n----------STRING CONCATENATION-----------");
System.out.print("\n\nusing concat() :"+s1.concat(" "+s2));
System.out.print("\n\nusing '+' operator :"+s1+" "+s2);
System.out.print("\n\n------CHARACTER EXTRACTION-----");
System.out.print("\n\ncharacter at 3rd position :"+s2.charAt(2));
char c[]=new char[5];
s1.getChars(2,4,c,0);
System.out.print("\n\ncharacter between 2 and 4 :"+new String(c));
System.out.print("\n\n----------CHARACTER COMPARISON-----------");
String x="welcome";
String y="WELCOME";
System.out.print("\n\nstring 1 :"+x);
System.out.print("\nstring 2 :"+y);
System.out.print("\n\n"+x+" equals "+y+" : "+x.equals(y));
System.out.print("\n\n"+x+" equals IgnoreCase "+y+" :"+x.equalsIgnoreCase(y));
System.out.print("\n\n"+x+" compare to "+y+" :"+x.compareTo(y));
System.out.print("\n\n"+x+" starts with w :"+x.startsWith("w"));
System.out.print("\n\n"+x+" ends with Z :"+y.endsWith("z"));
System.out.print("\n\n----------SEARCH SUBSTRING-----------");
String z="Are you ok";
System.out.print("\n\nstring :"+z);
System.out.print("\n\nSubstring using indexOf :"+z.indexOf("you"));
System.out.print("\n\nSubstring :"+z.substring(4));
System.out.print("\n\n------STRING MODIFICATION-----");
System.out.print("\n\nReplace the string :"+z.replace("ok","there"));
float n=15.3f;
System.out.print("\n\n"+n+" is converted to string "+String.valueOf(n));
System.out.println();
System.out.println();
}
}
