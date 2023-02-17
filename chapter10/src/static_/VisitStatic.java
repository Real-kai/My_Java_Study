package static_;

/**
 * @author 王凯
 * @version 1.0
 */
public class VisitStatic {
    public static void main(String[] args) {
        //通过类名称来访问
        System.out.println(A.name);//类变量随着类加载而创建，所以即使没有创建对象实例也可以访问。
        A a = new A();
        System.out.println(a.name);//也可以通过对象名来访访问
    }
}

class A{
    //类变量的访问必须遵守相关的访问权限
    public static String name  = "王凯是个天才！";


}
