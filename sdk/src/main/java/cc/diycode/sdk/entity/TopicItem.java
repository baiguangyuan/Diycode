package cc.diycode.sdk.entity;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public class TopicItem {

    /**
     * id : 995
     * title : 在一众梯子都被封杀后，你们都在用什么稀奇货翻墙？
     * created_at : 2017-10-26T15:24:40.075+08:00
     * updated_at : 2017-10-27T14:12:13.609+08:00
     * replied_at : 2017-10-27T14:12:13.591+08:00
     * replies_count : 2
     * node_name : 分享创造
     * node_id : 28
     * last_reply_user_id : 1
     * last_reply_user_login : jixiaohua
     * user : {"id":4143,"login":"harkben","name":"HarkBen","avatar_url":"https://diycode.cc/system/letter_avatars/2/H/69_208_226/240.png"}
     * deleted : false
     * excellent : false
     * abilities : {"update":false,"destroy":false}
     */

    public int id;
    public String title;
    public String created_at;
    public String updated_at;
    public String replied_at;
    public int replies_count;
    public String node_name;
    public int node_id;
    public int last_reply_user_id;
    public String last_reply_user_login;
    public UserItem user;
    public boolean deleted;
    public boolean excellent;
    public AbilityItem abilities;
}
