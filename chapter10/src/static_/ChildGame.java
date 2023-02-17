package static_;

/**
 * @author 王凯
 * @version 1.0
 */
public class ChildGame {
    public static void main(String[] args) {
        //int count=0;
        Child c1 = new Child("狐狸精");
        c1.join();
       // count++;
        Child c2 = new Child("白骨精");
        c2.join();
       // count++;
        Child c3 = new Child("黑熊精");
        c3.join();
       // count++;



        System.out.println("共有"+Child.count+" 位小孩加入了游戏");
    }
}

class Child{
    private String name;
    public static int count;


    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name+"加入了游戏...");
        count++;
    }

    public String getName() {
        return name;
    }

}
