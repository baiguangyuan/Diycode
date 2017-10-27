package cc.diycode.sdk.entity;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public class NewsItem {

    /**
     * id : 2678
     * title : 直播App中Android酷炫礼物动画实现方案（上篇）
     * created_at : 2017-10-27T00:12:59.963+08:00
     * updated_at : 2017-10-27T00:12:59.963+08:00
     * user : {"id":30,"login":"d_clock","name":"D_clock爱吃葱花","avatar_url":"https://diycode.b0.upaiyun.com/user/large_avatar/30.jpg"}
     * node_name : Android
     * node_id : 1
     * last_reply_user_id : null
     * last_reply_user_login : null
     * replied_at : null
     * address : https://mp.weixin.qq.com/s/f_ldQtMpA7GdQWDP40V45w
     * replies_count : 0
     */

    public int id;
    public String title;
    public String created_at;
    public String updated_at;
    public UserItem user;
    public String node_name;
    public int node_id;
    public Object last_reply_user_id;
    public Object last_reply_user_login;
    public Object replied_at;
    public String address;
    public int replies_count;
}
