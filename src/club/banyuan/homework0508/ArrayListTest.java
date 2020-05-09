package club.banyuan.homework0508;

public class ArrayListTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add("aaaaa");
        list.add(new Elephant("元宝"));
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list.size());
        System.out.println(list.set(0,22));
        System.out.println(list.remove((Integer)2));
        System.out.println(list.remove(0));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());
        printList(list);
    }
    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "]=" + list.get(i));
        }
    }
}
