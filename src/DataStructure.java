import object.List;

public class DataStructure {

    public static void main(String[] args) throws Exception {
        List list = new List();
        System.out.println(list);

        list.pushBack(8);
        System.out.println(list);

        list.pushBack(15);
        System.out.println(list);

        list.pushFront(20);
        System.out.println(list);

        list.pushBack(30);
        System.out.println(list);

        System.out.println(list.popBack());
        System.out.println(list.popFront());
    }
}
