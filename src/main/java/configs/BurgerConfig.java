package configs;

import burgers.BurgerBig;
import burgers.BurgerLittle;
import burgers.BurgerMedium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import supplements.*;


@Configuration
public class BurgerConfig {

    @Bean
    public Meat getMeat(){
        return new Meat();
    }

    @Bean
    public Salat getSalat(){
        return new Salat();
    }

    @Bean
    public Tomato getTomato(){
        return new Tomato();
    }

    @Bean
    public Peppers getPeppers(){
        return new Peppers();
    }
    @Bean
    public Potatoes getPotatoes(){
        return new Potatoes();
    }
    @Bean
    public Cheese getCheese(){
        return new Cheese();
    }


    @Bean
    public BurgerLittle getLittle() {
        return new BurgerLittle(getMeat(), getTomato(), getCheese());
    }

    @Bean
    public BurgerBig getBig(){
        return new BurgerBig(getMeat(), getTomato(), getPotatoes(), getCheese(), getSalat());
    }

    @Bean
    public BurgerMedium getMedium(){
        return new BurgerMedium(getMeat(), getPeppers(), getCheese(), getSalat());
    }
}
