// labraray management project -----------------------
import java.util.Scanner;
public class project {
	public static void main(String args[]) {
		char r;
		do {
		System.out.println("/////////////Library Management System///////////////");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to Issue a Book");
		System.out.println("Press 3 to return a Book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exit ->>");
		Scanner obj1=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER");
		int a=obj1.nextInt();
		switch(a) {
		case 1:
			Library aa=new Library();
			aa.add();
			break;
		case 2:
			Library bb=new Library();
			bb.iss();
			break;
		case 3:
			Library cc=new Library();
			cc.ret();
			break;
		case 4:
			Library dd=new Library();
			dd.detail();
			break;
		case 5:
			Library e=new Library();
			e.exit();
			break;
			default:
				System.out.println("Invalid Number");
			   }
		System.out.println("you want select next option Y/N");
		r=obj1.next().charAt(0);
		}
		while(r=='Y'||r=='N');
		if(r=='n'||r=='N')
		{
			Library z=new Library();
			z.exit();
			}
		
	}
		
	
}
		
		
		class Library
		{
			static String str,b,date;
			static int a,c;
			void add() {
				System.out.println("Enter Book Name ,Prize and Book-no.");
				Scanner obj2= new Scanner(System.in);
				String str=obj2.nextLine();
				float price=obj2.nextInt();
				int bookno = obj2.nextInt();
				System.out.println("Your details is given below::-> ");
				System.out.println("Book name ->"+ str);
				System.out.println("Prize ->"+ price);
				System.out.println("Book ID number ->"+ bookno);
				}
			void iss()
			{
				Scanner obj3=new Scanner(System.in);
				System.out.println("Book Name");
				str=obj3.nextLine();
				System.out.println("Book_ID");
				a=obj3.nextInt();
				obj3.nextLine();
				System.out.println("Issue Date");
				b=obj3.nextLine();
				System.out.println("Total number of BOOK Issued");
				c=obj3.nextInt();
				obj3.nextLine();
				System.out.println("Return book date");
				date=obj3.nextLine();
				}
			int getid() {
				return a;
			}
			
			void ret() {
				System.out.println("Enter student Name and Book ID");
				Scanner c= new Scanner(System.in);
				String name=c.nextLine();
				int bookid=c.nextInt();
				if(a==bookid) 
				{ 
				System.out.println("Total details");
				System.out.println("Book Name "+ Library.str);
				System.out.println("Book ID"+ Library.a);
				System.out.println("Issue Date"+ Library.b);
				System.out.println("Total number of BOOK Issued"+ Library.c);
				System.out.println("Book Return Date "+ Library.date);
				}
				else {
					System.out.println("Wrong ID , please Enter Correct ID");
				}
				
			}
			void detail()
			{
				System.out.println("<-- Your Book Details is -->");
				System.out.println("Book Name "+ Library.str);
				System.out.println("Book ID"+Library.a);
				System.out.println("Issue Date"+Library.b);
				System.out.println("Total number of BOOK Issued"+ Library.c);
				System.out.println("Book Return Date "+ Library.date);
			
			}
			void exit() {
				System.exit(0);
			}
			
		
		
		
		
	}
