import java.util.Arrays;
import java.util.Scanner;

class Book
{
    private String bname,author;
    Book()
    {//l.o.i

    }

    Book(String bname,String author)
    {
        this.bname=bname;
        this.author=author;
    }

    public String getBname() {
        return bname;
    }

    public String getAuthor() {
        return author;
    }


}

class Library
{
    static Scanner x = new Scanner(System.in);
    private String Libraryname;
    private Book [] books;

    Library()
    {// l.o.i

    }
    Library(String lname,Book [] books)
    {
       this.Libraryname=lname;
       this.books=books;
    }

    public String getLibraryname() {
        return Libraryname;
    }

    public static void getBook(Book[] books)
    {
        System.out.println("Enter the no of books to create : ");
          books=new Book[x.nextInt()];
          int c=1;
          for (int i = 0 ; i< books.length ; i++,c++)
          {
              System.out.println("Enter the name and author for the book number "+c);
              books[i]=new Book(x.next(), x.next());
          }


    }

    public void DetailsofLibrary()
    {
        System.out.println("Library Name : "+getLibraryname()+"\n");
        int d = 1;
        for(int i=0 ; i< books.length; i++)
        {
            System.out.println("Book : "+d);
            System.out.println(books[i].getBname());
            System.out.println(books[i].getAuthor());
            System.out.println("********************\n");

        }

    }



}


class Aggregation
{
}
