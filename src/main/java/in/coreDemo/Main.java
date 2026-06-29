package in.coreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // means to start a IOc container through Annotation based Config and all the rules ou need can be accessed by AppConfig ki class se

        OrderService order = context.getBean(OrderService.class);

        order.placeOrder();

//       PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();  //No need as we use @Autowired





















       // PaymentService service = new PaymentService();

        //OrderService order = new OrderService(service);
        //OrderService ke object order ke andar payment service kle object service ko wire kar raha hai
        //all the work like formation of object and work of wireing is done on only by main class but in spring it is done easily by IOC container
        //here we passed object of service
        //order.placeOrder();  //order ka call orderservice me jo placeOrder ka method hai

        Student s1 = new Student();  // s1 is a reference variable which points to the student / Object
        //Class

        Class<Student> c1 = Student.class;  //return type class of type student
    }
}

//c1 is not an object of Student class it stores all the meta data of the Student class
/*
class name --> Student
fields --> name, age
Constructor --> Student()
Method --> getAttendence(),print()
Anotations
 */
//if spring is managing all the object then it should have its all meta data thats why we use Reflection api
//Very very Important

class Student{
    private String name;
    private int age;

    public Student(){

    }

    public void getAttendence(){

    }

    public void print(){

    }
}



