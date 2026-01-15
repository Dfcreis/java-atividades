package Interface.modelServices;


import Interface.modelEntities.Contract;
import Interface.modelEntities.Installment;

import java.time.LocalDate;

public class ContractServices {
    private OnlinePaymentServices onlinePaymentServices;

    public ContractServices (OnlinePaymentServices onlinePaymentServices) {
        this.onlinePaymentServices = onlinePaymentServices;
    }
    public void processContract(Contract contract,int months) {

        double basicQuota = contract.getTotalvalue()/months;

       for(int i=1;i<months;i++) {

           LocalDate date = contract.getDate().plusMonths(i);

            double interest = onlinePaymentServices.interest(basicQuota,i);
            double fee = onlinePaymentServices.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getList().add(new Installment(date,quota));

       }
    }









}
