package learnjava;

import java.io.File;
import java.io.FilenameFilter;

public class filterExt implements FilenameFilter {
    String ext;
    
    public filterExt(String ext){
        this.ext = "." + ext;
    }
    
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}
