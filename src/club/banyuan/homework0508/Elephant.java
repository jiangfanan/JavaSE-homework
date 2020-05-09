package club.banyuan.homework0508;

import javax.swing.text.Element;

public class Elephant {
    private String name;
    public Elephant(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                '}';
    }
}
