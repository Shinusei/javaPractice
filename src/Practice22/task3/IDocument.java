package Practice22.task3;

import java.io.*;
import java.util.stream.Collectors;

public interface IDocument<T> {
    String getName();
    void setName(String name);
    String getContent();
    void setContent(String content);

    void save() throws IOException;
}

