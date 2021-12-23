package com.mh;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.XMLFormatter;

class displayBook {
    public String books[] = {"JAVA", "PYTHON", "C++", "DATA STRUCTURE", "OS"};

    public void Display() {
        System.out.println(Arrays.toString(books));
    }

}

class issueBooks {
    Scanner scanner = new Scanner(System.in);
    String bookName;

    public String issuedBook() {
        displayBook displayBook = new displayBook();

        System.out.println(Arrays.toString(displayBook.books));
        System.out.println("Enter Book Name You want to Issue : ");
        bookName = scanner.next();
        for (int i = 0; i < displayBook.books.length; i++) {
            if (displayBook.books[i].equals(bookName)) {
                displayBook.books[i] = null;
                i++;
            }
            displayBook.Display();
        }

        return bookName;
    }

}

class DisplayOptions {

    public int Options() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println(" 1. Issue Book \n 2. Add Book \n 3. Return Book \n 4. Show Available Books \n 5. Exit");
        System.out.print("Select Your Choice : ");
        n = sc.nextInt();
        return n;

    }
}

class checkOption {

    public void check(int a) {
        int n = a;
        String issuedBook;
        if (n == 4) {
            displayBook displayBook = new displayBook();
            displayBook.Display();
        } else if (n == 1) {
            issueBooks issueBook = new issueBooks();
            issueBook.issuedBook();


        }

    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        DisplayOptions displayOptions = new DisplayOptions();
        int op;
        do {
            op = displayOptions.Options();
            System.out.println(op);
            checkOption checkOption = new checkOption();
            checkOption.check(op);
        } while (op != 5);

    }
}
