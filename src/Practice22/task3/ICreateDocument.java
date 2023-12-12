package Practice22.task3;

import java.io.FileNotFoundException;

public interface ICreateDocument<T> {
    IDocument<T> CreateNew();

    IDocument<T> CreateOpen(String path) throws FileNotFoundException;
}
