package exception_.trycatch;

/**
 * @author 王凯
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
            System.out.println(res);
        } catch(NullPointerException e){
            System.out.println("空指针异常："+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("算数异常:"+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("异常信息："+e.getMessage());
        } finally {
            System.out.println("finally代码块执行");
        }
    }
}
class Person{
    private String name = "王凯";

    public String getName() {
        return name;
    }
}
