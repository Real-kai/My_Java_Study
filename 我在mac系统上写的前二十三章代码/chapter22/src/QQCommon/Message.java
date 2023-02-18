package QQCommon;

import java.io.Serializable;

/**
 * @author 王凯
 * @version 1.0
 */
public class Message implements Serializable {
    private String sender;//发送者
    private String getter;//接受者
    private String contain;//消息内容
    private String MesTime;//发送时间
    private String MesType;//消息类型

    private String fileName;

    private byte[] file ;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public String getMesTime() {
        return MesTime;
    }

    public void setMesTime(String mesTime) {
        MesTime = mesTime;
    }

    public String getMesType() {
        return MesType;
    }

    public void setMesType(String mesType) {
        MesType = mesType;
    }
}
