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

class issueBooks extends displayBook {
    Scanner scanner = new Scanner(System.in);
    String bookName;

    public String issuedBook() {
        System.out.println(Arrays.toString(books));
        System.out.println("Enter Book Name You want ti Issue : ");
        bookName = scanner.next();

        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(bookName)) {
                books[i] = "";
            }
            displayBook displayBook = new displayBook();
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
