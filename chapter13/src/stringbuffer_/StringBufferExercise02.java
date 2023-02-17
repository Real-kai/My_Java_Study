package stringbuffer_;

/**
 * @author 王凯
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
       print("手机",1098999.19);
    }
    public static void print(String name,double price){

        StringBuffer sb = new StringBuffer("" + price);

        for ( int i = sb.indexOf(".")-3; i >0 ; i-=3) {
                sb.insert(i,",");
        }
        System.out.println("商品名称\t价格");
        System.out.println(name+"\t"+sb);

    }
}
