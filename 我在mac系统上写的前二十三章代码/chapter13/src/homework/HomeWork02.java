package homework;

import java.util.regex.Pattern;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        try {
            userRegister("jack","899191","807478577@qq.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    public static void register(String userName,String password,String email){
//        char[] chars = password.toCharArray();
//        int b =0;
//        for (int i = 0; i < chars.length; i++) {
//           if (Character.isDigit(chars[i])==false){
//               b=-1;break;
//           }
//        }
//        if (!(userName!=null&&password!=null&&email!=null&&
//                (userName.length()==2||userName.length()==3||userName.length()==4)&&b==0&&password.length()==6
//        &&email.indexOf("@")>0&&email.indexOf(".")>0&&email.indexOf(".")>email.indexOf("@"))){
//            throw new RuntimeException("信息录入错误!");
//        }
//        System.out.println("注册成功！");
//    }

    //改进版
    public static void userRegister(String name,String psw,String email){
        if (!(name!=null&&psw!=null&&email!=null)){
            throw new RuntimeException("用户信息不能为空");
        }
        //过关斩将
        //第一关
        int l = name.length();
        if (!(l>=2&&l<=4)){
            throw new RuntimeException("用户名必须2-4位！");
        }

        //第二关
        if (!(psw.length()==6&&isDigit(psw))){
            throw new RuntimeException("密码必须是六位且全部是数字");
        }

        //第三关
        int i = email.indexOf('@');
        int o = email.indexOf('.');
        if (!(i>0&&o>i)){
            throw new RuntimeException("邮箱中必须包含@和.且@必须在.的前面");
        }

        System.out.println("注册成功!");
    }

    public static boolean isDigit(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]<'0'||chars[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
