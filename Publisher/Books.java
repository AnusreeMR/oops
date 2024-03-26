class Publisher{
String pubName;
Publisher(String pubName){
this.pubName=pubName;
}
void display(){
System.out.println("Publisher:"+pubName);
}
}
class Book extends Publisher{
String title;
String author;
Book(String pubName,String title,String author){
super(pubName);
this.title=title;
this.author=author;
}
void display(){
super.display();
System.out.println("Tittle\t\t:"+title);
System.out.println("Author\t\t:"+author);
}
}
class Literature extends Book{
String type;
Literature(String pubName,String title,String author,String type){
super(pubName,title,author);
this.type=type;
}
void display(){
super.display();
System.out.println("Type\t\t:"+type);
}
}
class Fiction extends Book{
String genre;
Fiction(String pubName,String title,String author,String genre){
super(pubName,title,author);
this.genre=genre;
}
void display(){
super.display();
System.out.println("Genre\t\t"+genre);
}
}
class Books{
public static void main(String[] args){
Literature[]l=new Literature[2];
Fiction[]f=new Fiction[2];
l[0]=new Literature("HarperColins","The Alchemist","Paulo Coelho","Drama");
l[1]=new Literature("D C Books","Aarachar","K.R.Meera","Novel");
f[0]=new Fiction("Cassel","Macbeth","William Shakespeare","Tragedy");
f[1]=new Fiction("Penguine Books","The Legends of Khasak","O V Vijayan","Magical Realism");
System.out.println("\tLiterature");
for(int i=0;i<l.length;i++){
System.out.println("#"+(i+1));
l[i].display();
}
System.out.println("\tFiction");
for(int i=0;i<f.length;i++){
System.out.println("#"+(i+1));
f[i].display();

}
}
}
