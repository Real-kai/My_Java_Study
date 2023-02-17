/**
 * @author 王凯
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.reads(5);
        bufferedReader_.read();

        BufferedReader_ bufferedReader_1 = new BufferedReader_(new StringReader_());
        bufferedReader_1.reads(3);
        bufferedReader_1.read();
    }
}
