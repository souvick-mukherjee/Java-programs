package souvick;
interface Player{
    void play();
}
class Actor implements Player{
    public void play(){
        System.out.println("This is an Actor");
    }
}
class Musician implements Player{
    public void play(){
        System.out.println("This is an Musician");
    }
}
class Footballer implements Player{
    public void play(){
        System.out.println("This is an Footballer");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        Actor a1=new Actor();
        Musician m1=new Musician();
        Footballer f1=new Footballer();
        a1.play();
        m1.play();
        f1.play();
    }
}
