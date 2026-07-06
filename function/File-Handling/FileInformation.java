import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Mansi\\OneDrive\\Desktop\\mansi.java");
        if(f.exists()){
            System.out.println("File Name:"+f.getName());
            System.out.println("File Location:"+f.getAbsolutePath());
            System.out.println("File Writable:"+f.canWrite());
            System.out.println("File Readable:"+f.canRead());
            System.out.println("File Size:"+f.length());
            System.out.println("File Delete:"+f.delete());        
    }
    else{
        System.out.println("File doesn't Exists.. ");
       }
    
            
 }
    

}

