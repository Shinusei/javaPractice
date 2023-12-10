package Practice19.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryReader {
    public static void main(String[] args) {
        File directory = new File(".");
        List<File> files = readDirectory(directory);
        System.out.println(files.subList(0, Math.min(5, files.size())));
    }

    public static List<File> readDirectory(File directory) {
        File[] filesArray = directory.listFiles();
        return new ArrayList<>(Arrays.asList(filesArray));
    }
}
