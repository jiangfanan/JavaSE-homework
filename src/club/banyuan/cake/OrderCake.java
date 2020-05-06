package club.banyuan.cake;

public class OrderCake extends Cake{
    public int weightInKG;
    @Override
    public int setPrice() {
        return(weightInKG*price);
    }
    public OrderCake(String name,int weightInKG){
         this.name=name;
        this.weightInKG=weightInKG;
    }
}
