import java.util.Objects;

class Box<T> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return this.item;
    }
    public boolean isEmpty() {
        return Objects.isNull(this.item);
    }
}

public class testJava {    
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        box.setItem("hello, world");
        System.out.printf("%s%n", (String)box.getItem());
        System.out.printf("%s%n", box.getItem());
    }
}