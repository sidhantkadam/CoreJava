package DesignPatterns.Behevioural;

import java.util.ArrayList;
import java.util.List;

//Create Originator
class Document {
    String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void write(String text) {
        this.content += text;
    }

    public void restoreFromMemento(DocumentMemento memento) {
        this.content = memento.getContent();
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(this.content);
    }
}

//Create Memento
class DocumentMemento {
    String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}

//Create Caretaker
class DocumentCaretaker {
    private final List<DocumentMemento> history = new ArrayList<>();

    public void addMemento(DocumentMemento memento) {
        this.history.add(memento);
    }

    public DocumentMemento getMemento(int index) {
        return this.history.get(index);
    }
}

public class MementoPattern {
    public static void main(String[] args) {
        Document document = new Document("Initial Content \n");
        DocumentCaretaker caretaker = new DocumentCaretaker();

        //Write some content
        document.write("Additional Content \n");
        caretaker.addMemento(document.createMemento());

        //Write more content
        document.write("More content \n");
        caretaker.addMemento(document.createMemento());

        //Restore the previous state
        document.restoreFromMemento(caretaker.getMemento(1));

        //Print the document content
        System.out.println(document.getContent());
    }
}
