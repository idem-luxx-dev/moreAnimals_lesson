package app.model;

public class Dog extends Animal{

    public Dog(String voi){
        this.voice = voi;
    }

    @Override
    public String toString(){
        return "I'm a dog";
    }

    @Override
    public void voice(){
        System.out.println(voice);
    }
}
