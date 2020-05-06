package club.banyuan.cake;

public class Test {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[10];
        cakes[0] = new OrderCake("OrderCake",10);
        cakes[1] = new OrderCake("OrderCake",12);
        cakes[2] = new ReadyMadeCake("ReadyMadeCake",19);
        cakes[3] = new ReadyMadeCake("ReadyMadeCake",12);
        cakes[4] = new OrderCake("OrderCake",23);
        cakes[5] = new ReadyMadeCake("ReadyMadeCake",20);
        cakes[6] = new OrderCake("OrderCake",6);
        cakes[7] = new ReadyMadeCake("ReadyMadeCake",15);
        cakes[8] = new OrderCake("OrderCake",24);
        cakes[9]=new OrderCake("OrderCake",26);
        int j=0; int w=0; int max=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(cakes[i].setPrice());
            if(cakes[i] instanceof ReadyMadeCake){
                 j=j+((ReadyMadeCake)cakes[i]).showquantity();
                 w=w+cakes[i].setPrice();
            }
            if(cakes[i].setPrice()>cakes[max].setPrice()){
                max=i;
            }
        }

        System.out.println("ReadyMadeCake的数量和："+j);
        System.out.println("ReadyMadeCake的总价为："+w);
        System.out.println("最高价格出售的蛋糕为："+cakes[max].name+"价格："+cakes[max].setPrice());

    }
}
