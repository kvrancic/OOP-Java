package hr.fer.oop.vjezbe.vjezba6.list;

public class MyList {
    private MyListElement head;


    int addLast(Object o){
    if(head == null){
        head = new MyListElement(o);
        return 0;
    }
        MyListElement current = head;
        int position = 0;
        while(current.getNext() != null)
        {
            position++;
            current = current.getNext();
        }
        current.setNext(new MyListElement(o));
        return position + 1;
    }

    void removeAt(int index){
        if(head == null)
            return;
        if(index == 0)
        {
            head = head.getNext();
            return;
        }
        MyListElement previous = head;
        MyListElement current = head.getNext();
        index--;
        while(index != 0 && current != null)
        {
            index--;
            previous = current;
            current = current.getNext();
        }
        if(current != null)
            previous.setNext(current.getNext());

    }



    Object elementAt(int index){
        if(index < 0)
            return null;

        if(head == null)
            return null;

        if(index == 0)
            return head.getContent();

        MyListElement current = head;
        while(current != null && index != 0)
        {
            current = current.getNext();
            index--;
        }
        if(current == null)
        {
            return null;
        }

        return current.getContent();
    }

    int size(){
        if(head == null) return 0;
        int size = 0;
        MyListElement current = head;
        while(current != null)
        {
            size++;
            current = current.getNext();
        }
        return size;
    }
}
