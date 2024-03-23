
import java.util.Scanner;
class Shapes{

//area of square

int area(int l)
{ 
 return (l*l);
}

//area of rectangle

int area(int l, int b)
{
 return (l*b);
}

//area of cuboid 

int area(int l, int b, int h)
{
 return ((l*b)/2+(b*h)/2+(l*h)/2);
}


public static void main(String[] args)
{
 Shapes s=new Shapes();
 System.out.println("area of square is:"+s.area(8));
 System.out.println("area of rectangle is:"+s.area(2,10));
 System.out.println("area of cuboid is:"+s.area(7,3,12));
}
}
