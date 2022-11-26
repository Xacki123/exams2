package ru.tsvetkov.exams;

import java.io.*;

public class BinHandler <T>{
    private File file = new File("saveLogs.bin");


    public void writeToFile(T object){
        try(FileOutputStream fileOutput = new FileOutputStream(file);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) { // дополнение к потоку
            // превращение объекта в последовательность байт
            objectOutput.writeObject(object);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public T readFromFile(){
        Object result = null;
        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            result = objectInput.readObject();
        } catch (IOException|ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        return (T) result;
    }
}
