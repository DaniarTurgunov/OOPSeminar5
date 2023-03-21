package Seminar5.HW.Service;

import Seminar5.HW.Model.Notebook;

import java.io.FileWriter;

public class NotebookServiceImpl implements NotebookService {
    @Override
    public void save(Notebook notebook) {
        try(FileWriter fileWriter = new FileWriter("notebookList.txt")){
            fileWriter.write(notebook.toString());
        }catch (Exception e){
            System.out.println("Ошибка");
            e.printStackTrace();
        }
    }

    @Override
    public void getN(Notebook notebook) {
        System.out.println(notebook.toString());
    }
}
