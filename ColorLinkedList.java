import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class ColorLinkedList {
    public static void main(String[] args) {
        // Create a linked list containing color names: red, blue, yellow, and orange
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        // Display the contents of the list using an Iterator
        System.out.println("Contents of the List using an Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the contents of the list in reverse order using a ListIterator
        System.out.println("\nContents of the List in reverse order using a ListIterator:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Create another list containing pink and green
        LinkedList<String> additionalColors = new LinkedList<>();
        additionalColors.add("pink");
        additionalColors.add("green");

        // Insert elements from additionalColors list between blue and yellow
        ListIterator<String> insertionPoint = colors.listIterator();
        while (insertionPoint.hasNext()) {
            if (insertionPoint.next().equals("blue")) {
                for (String color : additionalColors) {
                    insertionPoint.add(color);
                }
                break; // Inserted elements, so exit loop
            }
        }

        // Display the updated contents of the list
        System.out.println("\nContents of the List after inserting elements between blue and yellow:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
