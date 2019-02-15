
import burgers.BurgerBig;
import burgers.BurgerLittle;
import burgers.BurgerMedium;
import configs.BurgerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestBurgers {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BurgerConfig.class);
        BurgerLittle burgerLittle = context.getBean(BurgerLittle.class);
        BurgerMedium burgerMedium = context.getBean(BurgerMedium.class);
        BurgerBig burgerBig = context.getBean(BurgerBig.class);

        System.out.println("little: " + burgerLittle.price());
        System.out.println("medium: " + burgerMedium.price());
        System.out.println("big: " + burgerBig.price());

    }
}
