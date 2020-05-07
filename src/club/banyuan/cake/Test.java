package club.banyuan.cake;

public class Test {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[10];
        cakes[0] = new OrderCake("0",10,10);
        cakes[1] = new OrderCake("1",12,13);
        cakes[2] = new ReadyMadeCake("2",19,14);
        cakes[3] = new ReadyMadeCake("3",12,15);
        cakes[4] = new OrderCake("4",23,16);
        cakes[5] = new ReadyMadeCake("5",20,19);
        cakes[6] = new OrderCake("6",6,3);
        cakes[7] = new ReadyMadeCake("7",15,5);
        cakes[8] = new OrderCake("8",24,6);
        cakes[9]=new OrderCake("9",26,7);
        int sumquantity=0; int sumprice=0; int max=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(cakes[i].setPrice());
            if(cakes[i] instanceof ReadyMadeCake){
                 sumquantity=sumquantity+((ReadyMadeCake)cakes[i]).showquantity();
                 sumprice=sumprice+cakes[i].setPrice();
            }
            if(cakes[i].setPrice()>cakes[max].setPrice()){
                max=i;
            }
        }

        System.out.println("ReadyMadeCake的数量和："+sumquantity);
        System.out.println("ReadyMadeCake的总价为："+sumprice);
        System.out.println("最高价格出售的蛋糕为："+cakes[max].name+"价格："+cakes[max].setPrice());

    }
}
