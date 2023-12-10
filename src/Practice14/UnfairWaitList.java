package Practice14;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
    }
    public void remove(E element) {
        for(int i = 0; i < content.size();){
            E cur = content.remove();
            if (!cur.equals(element) | (cur.equals(element) && i == 0)) {
                content.add(cur);
                i++;
            }
        }
    }
    public void moveToBack(E element) {
        remove(element);
        content.add(element);
    }
}
