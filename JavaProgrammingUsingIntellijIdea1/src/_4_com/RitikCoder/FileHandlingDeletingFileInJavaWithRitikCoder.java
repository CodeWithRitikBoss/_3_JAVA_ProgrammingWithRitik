package _4_com.RitikCoder;

import java.io.File;

public class FileHandlingDeletingFileInJavaWithRitikCoder {
    public static void main(String[] args) {
        File file= new File("MyFile1.txt");
        if(file.delete()){
            System.out.println("This File is deleted successfully. "+ file.getName());
        }else{
            System.out.println("File is not found to delete.");
        }
    }
}
