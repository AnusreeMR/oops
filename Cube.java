class Cube{
public static void main(string[],args){
System.out.println("Enter a limit:");
Scanner sc=new Scanner(System.in);
int num=sc.nextint();
for(i=1; i<=num; i++)
{
System.out.println(i+"\t"+i*i*i);
}
}
}
