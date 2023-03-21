package Seminar5.HW.View;


import Seminar5.HW.Service.NotebookService;
import Seminar5.HW.Service.NotebookServiceImpl;
import Seminar5.HW.Model.Notebook;

public class NotebookView {
    private NotebookService notebookService = new NotebookServiceImpl();
    public void saveNotebook(String brand, int price , int ram , int ssd, String os){
        notebookService.save(new Notebook(brand, price, ram, ssd, os));
    }
    public void getNotebook(Notebook notebook){
        notebookService.getN(notebook);
    }
}
