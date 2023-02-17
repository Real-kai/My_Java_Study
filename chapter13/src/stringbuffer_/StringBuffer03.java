package stringbuffer_;

/**
 * @author 王凯
 * @version 1.0
 */
public class StringBuffer03 {
    public static void main(String[] args) {
        //String --> StringBuffer
        String str = "Hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = stringBuffer1.append(str);
        //StringBuffer-->String
        String s = stringBuffer2.toString();
        String s1 = new String(stringBuffer);
    }
}
