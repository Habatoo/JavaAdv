package generics.base;

public class Box3 <T extends Number> {

    private  T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

//    Number sum(Box3<? extends Number> a1, Box3<? extends Number> a2) {
//        return a1.getItem() + a2.getItem();
//    }

}
