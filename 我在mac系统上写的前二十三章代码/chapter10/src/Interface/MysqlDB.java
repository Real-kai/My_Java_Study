package Interface;

/**
 * @author 王凯
 * @version 1.0
 */
public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Mysql数据库");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql数据库");
    }
}
