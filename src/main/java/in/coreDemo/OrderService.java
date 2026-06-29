package in.coreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

   // @Autowired      //through field injection
    private PaymentService paymentService;  //payment servic is an reference object

    @Autowired                 //  Di is done through Constructor mostly remmended
  public OrderService(PaymentService paymentService){
       this.paymentService =paymentService;  //receiving
    }

    // if a single constructor then no need of @Autowired
//    @Autowired            //  DI is done through Setter
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){

        paymentService.pay();
        System.out.println("Order Placed");
    }
}
