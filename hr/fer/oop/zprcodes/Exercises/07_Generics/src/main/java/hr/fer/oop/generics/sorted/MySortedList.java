package hr.fer.oop.generics.sorted;

public class MySortedList<T extends Comparable<T>> {

    private MyListElement<T> head;

    public int add(T item) {
        if (head == null || item.compareTo(head.getContent()) < 0) {
            head = new MyListElement<>(item, head);
            return 0;
        }

        MyListElement<T> current = head;
        int index = 0;
                
        while (current.getNext() != null && current.getNext().getContent().compareTo(item) < 0) {
            current = current.getNext();
            index++;
        }

        var element = new MyListElement<T>(item);
        element.setNext(current.getNext());	        
        current.setNext(element);
        
        return index + 1;

    }

    public void removeAt(int index) {
        if (index == 0) {
        	if (head != null) {
        		head = head.getNext();
        	}
            return;
        }

        MyListElement<T> current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {           
            current = current.getNext();
        }

        if (current != null && current.getNext() != null) {
            current.setNext(current.getNext().getNext());
        }                      		
    }

    public T elementAt(int index) {
    	MyListElement<T> current = head;
		for(int i=0; i<index && current != null; i++){			
			current = current.getNext();			
		}
		return current == null ? null : current.getContent();		    	   
    }

    public int size() {
        MyListElement<T> current = head;
        int index = 0;
        for (; current != null; index++) {
            current = current.getNext();
        }
        return index;
    }
    
    public void print() {
    	MyListElement<T> current = head;
    	while(current != null) {
    		System.out.printf(" --> %s", current.getContent().toString());
    		current = current.getNext();
    	}
    	System.out.println();
    }
}
