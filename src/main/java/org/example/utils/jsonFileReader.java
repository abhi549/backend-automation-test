package org.example.utils;

import java.io.File;

public class jsonFileReader {
    public  static File jsonfileParse(String filename){
        File jsonDataInFile = new File("resources/testFiles/"+filename);
        return jsonDataInFile;
    }

}
