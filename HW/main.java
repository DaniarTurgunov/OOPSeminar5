package Seminar5.HW;

import Seminar5.HW.Model.Notebook;
import Seminar5.HW.Model.NotebookList;
import Seminar5.HW.View.NotebookView;

import java.util.Arrays;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("enter brand");
//        String brand = scanner.nextLine();
//        System.out.println("enter price");
//        int price = scanner.nextInt();
//        System.out.println("enter ram");
//        int ram = scanner.nextInt();
//        System.out.println("enter ssd");
//        int ssd = scanner.nextInt();
//        System.out.println("enter os");
//        String os = scanner1.nextLine();
        NotebookView notebookViewView = new NotebookView();
//        notebookViewView.saveNotebook(brand,price,ram,ssd,os);
        NotebookList notebookList = new NotebookList();
        notebookList.initNotebook(Arrays.asList(new Notebook("HP", 40000,16,325,"Windows"),
                new Notebook("Asus", 45000,16,500,"Linux"),new Notebook("Apple", 80000,32,650,"MacOS"),
                new Notebook("MSI", 90000,32,1000,"Windows")));
        notebookViewView.getNotebook(notebookList.getNotebooklist("Asus"));
    }
}
