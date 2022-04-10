package generics.base;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        box.setItem(new Integer(5));

        System.out.println(box.getItem());
        System.out.println(box.getClass());

        box.setItem(new String("string"));
        System.out.println(box.getItem());
        System.out.println(box.getClass());

        // generic
        Box2<String> stringBox = new Box2<>();
        Box2 rawBox = stringBox;
        rawBox.setItem(8);  // warning: unchecked invocation to set(T)
        System.out.println("raw");
        System.out.println(rawBox.getItem());
        System.out.println(rawBox.getClass());

        Box2<Integer> box2 = new Box2<>();
        box2.setItem(2);
        System.out.println(box2.getItem());
        System.out.println(box2.getClass());

        Box2<String> box2String = new Box2<>();
        box2String.setItem("2");
        System.out.println(box2String.getItem());
        System.out.println(box2String.getClass());

        // wildcards
        Box3<Integer> box3Int = new Box3<>();
        box3Int.setItem(2);
        System.out.println(box3Int.getItem());
        System.out.println(box3Int.getClass());

        Box3<Float> box3Float = new Box3<>();
        box3Float.setItem(2.0f);
        System.out.println(box3Float.getItem());
        System.out.println(box3Float.getClass());

        Box3<Long> box3Long = new Box3<>();
        box3Long.setItem(2L);
        System.out.println(box3Long.getItem());
        System.out.println(box3Long.getClass());
        System.out.println(box3Long.getItem() + box3Long.getItem());

        Box3<Number> box3Number = new Box3<>();
        box3Number.setItem(2L);
        System.out.println(box3Number.getItem());
        System.out.println(box3Number.getClass());
        // System.out.println(box3Number.getItem() + box3Number.getItem());

    }

}

