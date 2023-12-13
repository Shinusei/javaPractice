package Practice14;
import java.util.Collection;
public abstract class IWaitList<E> {
    abstract void add(E element);
    abstract E remove();
    abstract boolean contains(E element);
    abstract boolean containsAll(Collection<E> c);
    abstract boolean isEmpty();
}
