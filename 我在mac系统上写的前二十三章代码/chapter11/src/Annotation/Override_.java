package Annotation;

/**
 * @author 王凯
 * @version 1.0
 */
public class Override_ {

}
class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}
class Son extends Father{
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}
