package club.banyuan.cake;

public class ReadyMadeCake extends Cake{
    public int quantity;
    @Override
    public int setPrice() {

        return (quantity*price);
    }
    public ReadyMadeCake(String name,int quantity){
        this.name=name;
        this.quantity=quantity;
    }
    public int showquantity(){
        return quantity;
    }


}
