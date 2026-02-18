import java.io.File;
import java.util.Scanner;

public class ClassExampleFileObject {
    public static final int fileSizeLimit = 1000*1000;

    public static void main(String[] args) throws Exception {
        System.out.print("Enter a filename: ");
        Scanner stdin = new Scanner(System.in);
        String filename = stdin.next();
        File userfile = new File(filename);

        if (userfile.exists()) {
            showFile(userfile);
            if (userfile.length()> fileSizeLimit)
                if (!userfile.delete())
                    System.out.println("WARNING: could not delete: "+filename);
        } else {
            userfile.createNewFile();
            showFile(userfile);
        }
    }

    public static void showFile(File ufile) {
        System.out.println("Full Pathname Is: "
                +ufile.getAbsolutePath()+" size: "+ufile.length());
    }
}
