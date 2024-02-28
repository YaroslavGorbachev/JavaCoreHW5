package ru.geekbrains.core.lesson1.task5;

import java.io.File;
import java.io.IOException;

import static ru.geekbrains.core.lesson1.task5.Tree.*;


public class Program {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\Zheka\\Desktop\\IT\\книги";
        String sourc1 = "C:\\Users\\Zheka\\Desktop\\IT";
        String destination = "C:/backup";
        //backupFolder(source, destination );

        print(new File(source), "", true);

    }
}