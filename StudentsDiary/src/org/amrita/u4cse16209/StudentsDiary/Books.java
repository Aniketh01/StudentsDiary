package org.amrita.u4cse16209.StudentsDiary;

import java.util.Scanner;

public class Books {
	
	String title;
    String author;

    Books()
    {
            title = "";
            author = "";
    }

    Books(String t, String aut)
    {
            title = t;
            author = aut;
    }

    public void setBookDetails()
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the title of the book");
            title = sc.next();
            System.out.println("Enter the author's name");
            author = sc.next();
    }

    public String getTitle()
    {
            return title;
    }

    public String getRemark()
    {
            return author;
    }

    public String toString()
    {
            return title +"\n" + author + "\n";
    }
    
    public void Display() {
    	System.out.println(toString());
    }

}
