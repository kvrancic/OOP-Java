package hr.fer.oop.vjezbe.vjezba6.list;

public class MyListElement  {
    private Object content;
    private MyListElement next;

    public MyListElement(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public MyListElement getNext() {
        return next;
    }

    public void setNext(MyListElement next) {
        this.next = next;
    }
}
