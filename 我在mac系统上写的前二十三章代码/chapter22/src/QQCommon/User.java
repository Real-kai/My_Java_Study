package QQCommon;

import java.io.Serializable;
import java.util.Vector;

/**
 * @author 王凯
 * @version 1.0
 */
public class User implements Serializable {
    private String UserID;//用户ID
    private String password;//用户密码

    public User() {
    }

    public User(String userID, String password) {
        UserID = userID;
        this.password = password;
    }


    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
