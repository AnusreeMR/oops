import java.util.*;
import java.util.Arrays;
class ArraySearch{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of array elements:");
int size = sc.nextInt();
int numbers[] =new int[size];
System.out.println("Enter the array elements:");
for(int i=0;i<size;i++)
{
numbers[i]=sc.nextInt();
}
ArraySearch as=new ArraySearch();
System.out.print("\n Enter the elements to search:");
int se=sc.nextInt();
System.out.println(" Choose:\n 1.Linear Search\n 2.Binary Search\n 3.Built in Search\n 4.Recursive binary search");
System.out.print("Enter your Option:");
int opt= sc.nextInt();
int result=-1;
switch (opt)
{
case 1:result=as.linearSearch(se,numbers);
	break;
case 2:Arrays.sort(numbers);
	result=as.simpleBinarySearch(se,numbers);
	break;
case 3:Arrays.sort(numbers);
	result=Arrays.binarySearch(numbers,0,size-1,se);
	break;
case 4:Arrays.sort(numbers);
	result=as.recursiveBinarySearch(numbers,0,size-1,se);
	break;
default:System.out.print("\n invalid option...!");
	break;
}
	if(result>-1){
	System.out.println(se+" found");
	}
	else
	{
	System.out.println(se+" not found");
	}
	}
//LINEAR SEARCH
int linearSearch(int n,int[]numbers)
{
for(int i=0;i<numbers.length;i++)
{
if(numbers[i]==n)
{
return i;
}
}
return -1;
}
//BINARY SEARCH
int simpleBinarySearch(int n,int[]numbers)
{
int first=0;
int last=numbers.length -1;
int mid=(first+last)/2;
while(first<=last)
{
if(numbers[mid]<n)
{
first=mid+1;
}
else if(numbers[mid]>n)
{
last=mid-1;
}
else
{
return mid;
}
mid=(first+last)/2;
}
return-1;
}
//RECURSIVE BINARY SEARCH
int recursiveBinarySearch(int[]numbers,int first,int last,int x){
if(first<=last && first<numbers.length-1){
int mid=first +(last-first)/2;
if(numbers[mid]<x){
return recursiveBinarySearch(numbers,mid+1,last,x);
}
if(numbers[mid] >x){
return recursiveBinarySearch(numbers,first,mid-1,x);
}
return mid;
}
return -1;
}
}
