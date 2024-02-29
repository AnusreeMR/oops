class Cpu{
int price = 34000;
class Processor
{
int noofcores=4;
String manufacture="intel corp.";
void display()
{
System.out.println("No of Cores:"+noofcores);
System.out.println("manufacture:"+manufacture);
}
}
void display()
{
Processor P = new Processor();
P.display();
System.out.println("price:"+price);
}
static class Ram
{
int memory=8;
String manufacturer="Corsair";
void display(){
System.out.println("Memory:"+memory);
System.out.println("manufacturer:"+manufacturer);
}
}
}
class Cpus
{
public static void main(String[] args){
Cpu c1 = new Cpu();
c1.display();
Cpu.Ram r1= new Cpu.Ram();
r1.display();
}
}	
