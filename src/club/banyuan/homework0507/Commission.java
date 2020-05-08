package club.banyuan.homework0507;

public class Commission extends Hourly {
    private double commissionrate;
    private double totalSales;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionrate){
        super(eName,  eAddress,  ePhone,  socSecNumber, rate);
        this.commissionrate=commissionrate;
        totalSales=0;

    }


    public void addSales(double totalSales){
        this.totalSales+=totalSales;
    }

    @Override
    public double pay() {
        double payment=super.pay()+commissionrate*totalSales;
        totalSales=0;
        return payment;
    }

    @Override
    public String toString() {
        String result=super.toString()+"\n总销售额："+totalSales;
        return result;
    }
}
