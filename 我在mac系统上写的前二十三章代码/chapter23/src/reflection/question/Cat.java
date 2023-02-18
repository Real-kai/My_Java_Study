package reflection.question;

/**
 * @author 王凯
 * @version 1.0
 */
public class Cat {
    private String name = "小黄";
    public int age = 10;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public void hi(){
        //System.out.println("hi"+name);
    }

    public void cry(){
        //System.out.println(name+"喵喵叫...");
    }

}
