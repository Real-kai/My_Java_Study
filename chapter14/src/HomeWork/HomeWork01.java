package HomeWork;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 王凯
 * @version 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        list.add(new News("男子突然想起两个月前钓的鱼还在往兜里，捞起一看赶紧放生"));
        for (int i = list.size()-1; i >=0 ; i--) {
            News news = (News)list.get(i);
            String title = news.getTitle();
            if (title.length()>15){
                String substring = title.substring(0, 15);
                System.out.println(substring+"...");
            }
           else{ System.out.println(title);}
        }

    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return
                "title='" + title
              ;
    }
}
