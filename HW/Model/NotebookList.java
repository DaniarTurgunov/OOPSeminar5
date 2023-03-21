package Seminar5.HW.Model;

import Seminar5.CW1.model.User;

import java.util.ArrayList;
import java.util.List;

public class NotebookList {
    private List<Notebook> notebookList = new ArrayList<>();
    public void initNotebook (List<Notebook> notebookList) {
        this.notebookList = notebookList;
    }

    public Notebook getNotebooklist(String brand) {
        for (Notebook notebook : notebookList) {
            if (notebook.getBrand().equalsIgnoreCase(brand)) return notebook;
        }
        return new Notebook("Такого товара нет", 0,0,0,"");
    }
}
