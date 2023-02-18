/**
 * @author 王凯
 * @version 1.0
 */
public class BufferedReader_ extends Reader_{
    Reader_ reader_ ;

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void read(){
        reader_.read();
    }


    public void reads(int num){
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }


}
