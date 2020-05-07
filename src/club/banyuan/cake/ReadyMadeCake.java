package club.banyuan.cake;

public class ReadyMadeCake extends Cake{
    public int quantity;
    @Override
    public int setPrice() {

        return (quantity*this.price);
    }
    public ReadyMadeCake(String name,int price,int quantity){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public int showquantity(){
        return quantity;
    }


}
