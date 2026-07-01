package in.Cdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired  //how private get resolved without any setter -->java used spring reflection so through which it can acces private
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();

        //call here
        getOrderDetail();


        System.out.println("Order Placed");
    }

    public void getOrderDetail(){


        System.out.println("Order Details");
    }
}
