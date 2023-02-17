package abstract_;

/**
 * @author 王凯
 * @version 1.0
 */
abstract public class CC {
    private String name;

    public CC(String name) {
        this.name = name;
    }

    abstract public void job();
    public void calculate(){
        long star = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println(getName()+"总共花了"+(end-star)+"毫秒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
