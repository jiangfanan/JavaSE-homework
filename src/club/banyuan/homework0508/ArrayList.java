package club.banyuan.homework0508;

public class ArrayList implements List {
    private Object []data= new Object[10];
   public int size=0;
    private int MaxSize=10;
    @Override
    public Object set(int index, Object element) {
        Object obj=new Object();
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }

        else{
           obj=this.data[index];
            this.data[index]=element;
        }
        return obj;
    }
    @Override
    public Object get(int index) {
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }
        else{
            return this.data[index];
        }

    }
    @Override
    public void clear() {
        while(!this.isEmpty()){
            for(int i=0;i<size;i++){
                this.data[i]=null;
                size--;
            }
        }
    }
    @Override
    public Object remove(int index) {
        Object obj=new Object();
        if (index >= size) {
            System.out.println("下标不合法");
            return null;
        }
        else{
            obj=this.data[index];
            for(int i=index;i<size;i++){
                data[i]=data[i+1];

            }
            size--;

        }
        return obj;
    }
    @Override
    public boolean remove(Object o) {
        int sum=this.size();
        for(int i=0;i<size;i++){
            if(data[i].equals(o)){
                for(int j=i;j<size;j++){
                    data[j]=data[j+1];

                }
                size--;
                return true;
            }
        }
        int sum2=this.size();
        if(sum2<sum){
            return true;
        }
        else{
            return false;

        }

    }
    @Override
    public boolean add(Object o) {
        if(size<MaxSize){
            this.data[size]=o;
            size++;
            return true;
        }
        if(size>=MaxSize){
           MaxSize=MaxSize*2;
           Object []data1=new Object[MaxSize];
           for(int i=0;i<size;i++){
               data1[i]=data[i];
           }
           this.data=data1;
           data1[size]=o;
           size++;

        }
        return true;
    }


    @Override
    public boolean isEmpty() {
        return size==0;
    }
    @Override
    public int size() {
        int i=0;
        while((this.data[i])!=null){
          i++;
        }
        return i;
    }
}
