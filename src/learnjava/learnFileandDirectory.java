package learnjava;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

import static java.lang.System.out;

public class learnFileandDirectory {
    public static void main(String[] args){
        File myfile = new File("D:/Fullstack/Backend/Learn Java/src/learnBackend/learnFile.java");
        out.println("File name: " + myfile.getName());
        out.println("File Path: " + myfile.getPath());
        out.println("Absolute File Path: " + myfile.getAbsolutePath());
        out.println("File parent: " + myfile.getParent());
        out.println(myfile.exists());
        out.println(myfile.isHidden());
        out.println(myfile.canWrite());
        out.println(myfile.isFile());
        out.println(myfile.length() + " bytes");

        String directoryName = "D:/Fullstack/Backend/Learn Java/src/learnBackend";
        File myDir = new File(directoryName);

        out.println(myDir.isDirectory());

        if(myDir.isDirectory()) {
            out.println(directoryName + " is a directory.");
            String[] s = myDir.list();

            for(int i=0; i<s.length; i++){
                File f = new File(directoryName + "/" + s[i]);
                if(f.isDirectory()){
                    out.println(s[i] + " is a directory");
                }
                else{
                    out.println(s[i] + " is a file");
                }
            }
        }
        else{
            out.println(directoryName + " is not a directory.");
        }

        filterExt only = new filterExt("java");
        File myDir1 = new File(directoryName);

        if(myDir1.isDirectory()){
            out.println("Java source files in " + directoryName);

            String[] s = myDir1.list(only);

            for(String javaFiles : s){
                out.println(javaFiles);
            }
        }

    }
}
