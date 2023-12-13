package Practice14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Default constructor that creates an empty wait list.
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Constructor that creates a wait list and adds all the elements of the specified collection to it.
     *
     * @param c the collection whose elements are to be added to this wait list
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Adds the specified element to the end of this wait list.
     *
     * @param element the element to be added
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    /**
     * Retrieves and removes the head of this wait list, or returns null if this wait list is empty.
     *
     * @return the head of this wait list, or null if this wait list is empty
     */
    @Override
    public E remove() {
        if(isEmpty()) return null;
        return content.remove();
    }

    /**
     * Returns true if this wait list contains the specified element.
     *
     * @param element the element whose presence in this wait list is to be tested
     * @return true if this wait list contains the specified element
     */
    @Override
    public boolean contains(E element) {
        for(E i : content){
            if(element.equals(i)) return true;
        }
        return false;
    }

    /**
     * Returns true if this wait list contains all of the elements of the specified collection.
     *
     * @param c the collection to be checked for containment in this wait list
     * @return true if this wait list contains all of the elements of the specified collection
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        for (E i: c) {
            if(!contains(i)) return false;
        }
        return true;
    }

    /**
     * Returns true if this wait list contains no elements.
     *
     * @return true if this wait list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    /**
     * Returns a string representation of this wait list. The string representation consists of a list of the wait list's elements in the order they are returned by its iterator, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", " (comma and space).
     *
     * @return a string representation of this wait list
     */
    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}