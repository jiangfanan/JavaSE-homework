package club.banyuan.cake;

public class OrderCake extends Cake{
    public int weightInKG;
    @Override
    public int setPrice() {
        return(weightInKG*this.price);
    }
    public OrderCake(String name,int price,int weightInKG){
         this.name=name;
        this.weightInKG=weightInKG;
        this.price=price;
    }
}
