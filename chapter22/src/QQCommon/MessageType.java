package QQCommon;

/**
 * @author 王凯
 * @version 1.0
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED = "1";//表示登陆成功
    String MESSAGE_LOGIN_FAIL = "2";//表示登录失败
    String MESSAGE_COM = "3";//普通消息类型
    String MESSAGE_GET_ONLINE_FRIEND = "4";//得到在线用户列表消息类型
    String MESSAGE_RET_ONLINE_FRIEND = "5";//返回在线用户列表类型
    String MESSAGE_CLIENT_EXIT  ="6";//用户退出
    String MESSAGE_GROUP_CHAT = "7";//群发
    String MESSAGE_SEND_FILE = "8";//发送文件
    String MESSAGE_BACK_NEWS = "9";
}
