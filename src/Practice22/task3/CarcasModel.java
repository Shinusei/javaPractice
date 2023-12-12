package Practice22.task3;

public class CarcasModel {
    private IDocument<?> document;

    public CarcasModel() {
    }

    public CarcasModel(IDocument<?> document) {
        this.document = document;
    }

    public IDocument<?> getDocument() {
        return document;
    }

    public void setDocument(IDocument<?> document) {
        this.document = document;
    }
}
