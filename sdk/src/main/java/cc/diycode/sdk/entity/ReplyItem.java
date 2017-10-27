package cc.diycode.sdk.entity;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public class ReplyItem {

    /**
     * id : 4160
     * body_html : <p>中国部分ISP已经实施国外端口白名单政策，国内用户无法访问国外服务器的指定端口，目前我在深圳用的一个电信网络已经实施，该白名单实施的效果是，用户无法远程SSH管理国外服务器，大部分访问国外的软件和游戏都会异常，如此广泛而无区别的高强度审查，是历史上最严厉的一次，几乎和断网无异。 ​​​​</p>

     <p>我现在家里网络翻不了，但是我用流量可以。</p>
     * created_at : 2017-10-27T12:03:48.901+08:00
     * updated_at : 2017-10-27T12:03:48.901+08:00
     * deleted : false
     * topic_id : 995
     * user : {"id":1,"login":"jixiaohua","name":"寂小桦","avatar_url":"https://diycode.b0.upaiyun.com/user/large_avatar/2.jpg"}
     * likes_count : 0
     * abilities : {"update":false,"destroy":false}
     */

    public int id;
    public String body_html;
    public String created_at;
    public String updated_at;
    public boolean deleted;
    public int topic_id;
    public UserItem user;
    public int likes_count;
    public AbilityItem abilities;
}
