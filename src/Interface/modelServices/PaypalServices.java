package Interface.modelServices;

public class PaypalServices implements OnlinePaymentServices{



    @Override
    public double paymentFee (Double amount){
        return amount*0.2;
    }

    @Override
    public double interest(Double amount, Integer months){
        return amount*0.1*months;
    }
}
