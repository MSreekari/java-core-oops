package concepts.polymorphism;

import java.util.ArrayList;
import java.util.List;

abstract class DocumentElement{

    abstract void render();
}
class Text extends DocumentElement{
    private String text;

    public Text(String text){
        this.text = text;
    }

    @Override
    void render() {
        System.out.println("Text rendered using text element: " + text);
    }
}
class Image extends DocumentElement{
    private String image;
    public Image(String image){
        this.image = image;
    }
    @Override
    void render() {
        System.out.println("Image rendered using image element: " + image);
    }
}
class Table extends DocumentElement{
    private String table;

    public Table(String table){
        this.table = table;
    }

    @Override
    void render() {
        System.out.println("Table rendered using table element: " + table);
    }
}
public class DocumentEditor {
    public static void main(String[] args) {
        List<DocumentElement> elements = new ArrayList<DocumentElement>();
        elements.add(new Text("This is a text element"));
        elements.add(new Image("This is an image element"));
        elements.add(new Table("This is a table element"));
        for(DocumentElement element : elements){
            element.render();
        }
    }
}
