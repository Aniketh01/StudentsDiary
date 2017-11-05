package org.amrita.u4cse16209.StudentsDiary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Library {
	
        Dues due;
        Date issuedate,duedate;
        int issueno;
        Books book;

        Library()
        {
                issueno = 0;
                due = new Dues();
                book = new Books();
                Calendar cal = Calendar.getInstance();
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
                issuedate = cal.getTime();
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
                duedate = cal.getTime();
        }

        Library(Dues due, Books book)
        {
                this.due = due;
                this.book = book;
                Calendar cal = Calendar.getInstance();
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
                issuedate = cal.getTime();
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
                duedate = cal.getTime();
        }

        public void extendDueDate()
        {
                if (issueno==2)
                        System.out.println("Sorry, we can't extend the book any further");
                else
                        issueno++;
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(duedate);
                        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH));
                        duedate = cal.getTime();


        }

        public String toString()
        {
                SimpleDateFormat dateOnly = new SimpleDateFormat("dd/MM/yyyy");
                return book.toString() + "Date Issued: " + dateOnly.format(issuedate) + "\n" + "Date Due:" + dateOnly.format(duedate) + "\n" + "Fine:" + due.getFine() + "\n" ;
        }

        public void addFine()
        {
                due.newDue();
        }

        public void borrowbook()
        {
                Books b = new Books();
                b.setBookDetails();
                book = b;
        }

        public Dues getFine()
        {
                return due;
        }
}

