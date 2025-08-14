package JavaOOPs;
interface Greeting{
    public String getStandardMessage(String name);
    public String getCustomMessage(String name);
}
abstract class AbstractGreeting implements Greeting{
    public String getStandardMessage(String name){
        return "Hi "+name;
    }
    public abstract String getCustomMessage(String name);
}
class EnglishGreeting extends AbstractGreeting{
    public String getCustomMessage(String name){
        return "Hello "+name;
    }
}
public class AbstractionImplementation {
    public static void main(String[] args){
        Greeting english = new EnglishGreeting();
        System.out.println(english.getStandardMessage("Winston"));
        System.out.println(english.getCustomMessage("Winston"));

    }
}
