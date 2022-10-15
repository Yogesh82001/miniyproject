
class person
{
 String name ,gender;
 int age;
 person()
 {
	 name ="yogesh";
	 gender ="male";
	 age = 20;
 }
 person(String name,String gender,int age)
 {
	 this.name=name;
	 this.gender=gender;
	 this.age=age;
	
 }
 void show()
 {
	 System.out.println("Name is"+name);
	 System.out.println("Gender is "+gender);
	 System.out.println("Age is"+age);
	 
 }
}
class constructexam
{
	public static void main(String ags[]) {
{
	person p =new person();
	p.show();
	person p1= new person();
	p1.show();
	person p2= new person();
	p2.show();
}
}
}