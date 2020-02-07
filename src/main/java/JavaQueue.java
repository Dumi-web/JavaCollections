import org.graalvm.compiler.hotspot.stubs.OutOfBoundsExceptionStub;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class JavaQueue {

    public int getUniqueNumbers(int SubArraySize)
    {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.add(2);
        deque.add(2);
        deque.add(2);
        deque.add(2);
        deque.add(2);
        deque.add(2);
        deque.add(2);




        int MaxUnique = 0;

             Object[] dequeArray = deque.toArray();
                for (int i = 0; i < dequeArray.length - SubArraySize; i++) {
                int uniqueNumber = 0;

                for (int j = i; j < i + SubArraySize; j++) {
                    if (!dequeArray[i].equals(dequeArray[j])) {
                        uniqueNumber++;
                    }
                }
                if (uniqueNumber > MaxUnique) {
                    MaxUnique = uniqueNumber;
                }
        }
                if(MaxUnique == 0)
                    MaxUnique = 1;

                    return  MaxUnique;
    }




}



