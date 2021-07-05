package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    public Cat(String voi){
        this.voice = voi;
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }

    @Override
    public void voice(){
        System.out.println(voice);
    }
}
