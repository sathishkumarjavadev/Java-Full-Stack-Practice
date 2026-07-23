package p009_collections_framework;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Example {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Sathish");
        students.add("Rahul");
        students.add("Kumar");

        Iterator< String> it = students.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

//after reaching the end , if we call next element it throws java.util.NoSuchElementException

//⭐ Interview Question
//
//Why do we use hasNext() before next()?
//
//A good interview answer is:
//
//hasNext() checks whether another element is available. Calling next() without checking can throw a NoSuchElementException when the iterator reaches the end of the collection.
//
//That's a concise and technically correct explanation.