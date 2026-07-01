package in.coreDemo.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("UPi")  //here UPi is an bean name given by us
public class UPIpayment implements PaymentService {

    @Override

    public void pay(){
        System.out.println("Payment by UPI");
    }
}
