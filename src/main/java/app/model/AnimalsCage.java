package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    @Qualifier("cat")
    private Animal smallerAnimal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Voice:");
        System.out.println(chooseAnimal().toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

    public Animal chooseAnimal(){
        if((new Random().nextInt(2)) == 1){
            return animal;
        } else {
            return smallerAnimal;
        }
    }

    public Timer getTimer(){
        return timer;
    }

}
