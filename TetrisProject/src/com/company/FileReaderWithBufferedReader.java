package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderWithBufferedReader {

    public static void main(String[] args) throws IOException {
        String file = "output.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null){
            System.out.println(curLine);
        }
        bufferedReader.close();
    }
}