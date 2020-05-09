package club.banyuan.homework0508;

public class LinkedList implements List {

    private final Node head = new Node();
    private Node tail = head;
    private int size;

    @Override
    public Object set(int index, Object element) {
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }
        else{
           Node cur=head;
           Object obj=new Object();

            for(int i=0;i<=index;i++){
               cur=cur.getNext();
               obj=cur.getData();

           }
            cur.setData(element);
            return obj;
        }

    }

    @Override
    public Object get(int index) {
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }
        int count = index;
        Node cur = head;
        while (count != -1) {
            cur = cur.getNext();
            count--;
        }
        return cur.getData();
    }

    @Override
    public void clear() {
         if(this.isEmpty()){
             System.out.println("已清空");
         }
         else{
             tail=head;

             }

         }


    @Override
    public Object remove(int index) {
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }

        else{
            Node cur=head;
            for(int i=0;i<=index;i++){
                cur=head.getNext();
            }
            Node cur1=cur.getNext();
            Node cur2=cur.getPrev();
            if(cur1==null){
                cur2.setNext(tail);
                tail=cur2;
                size--;
            }
           else {
                cur1.setPrev(cur2);
                cur2.setNext(cur1);
                size--;
            }
            return cur.getData();

        }

    }

    @Override
    public boolean remove(Object o) {
        Node cur=head;
        for(int i=0;i<size;i++){
            if((this.get(i)).equals(o)){
                this.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node();
        node.setData(o);
        node.setPrev(tail);
        tail.setNext(node);
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if(tail==head){return true;}
        else{return false;}

    }

    @Override
    public int size() {
        if(tail==head){
            size=0;
        }

        else{
            int i=0;
            Node cur=head.getNext();
            while(cur!=null){
                i++;
                cur=cur.getNext();
            }
        }
        return size;
    }
}
