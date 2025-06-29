import java.util.*;

interface Iterator{
    public boolean has_next();
    public Object get_next();
}

class Sequence{
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr; 
    int size;
    private int currentSize = 0;
    
    // Parameterized constructor
    public Sequence(int size) {
        this.size = size;
        iArr = new int[Math.min(size, maxLimit)];
    }

    // Add an element to the sequence
    public void addTo(int elem) {
        if (currentSize < size) {
            iArr[currentSize++] = elem;
        } else {
            System.out.println("Array limit exceeded.");
        }
    }

    // Return an iterator
    public Iterator get_Iterator() {
        if (_iter == null)
            _iter = new SeqIterator();
        return _iter;
    }

    // Inner class for iterator
    private class SeqIterator implements Iterator {
        int indx;

        public SeqIterator() {
            indx = -1;
        }

        public boolean has_next() {
            return indx + 1 < currentSize;
        }

        public Object get_next() {
            if (has_next()) {
                indx++;
                return iArr[indx];
            } else {
                return null;
            }
        }
    }
}


class FClass{
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while(i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}