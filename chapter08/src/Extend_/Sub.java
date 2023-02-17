package Extend_;

/**
 * @author 王凯
 * @version 1.0
 */
public class Sub extends Base{
   public Sub(){
       super("张三",19);//子类必须调用父类的构造起完成父类的初始化
//       super();//默认调用父类的无参构造器
       System.out.println("Sub()....");
   }

   //私有的属性和方法不能在子类中直接访问  要通过父类的公共方法去访问
   //非私有的属性和方法可以直接在子类中访问
   public void sayOk(){
       System.out.println("n1="+n1+" n2="+n2+" n3="+n3+" n4="+getN4());
       test100();
       test200();
       test300();
       getTest400();
       //test400(); 错误写法
   }


}
