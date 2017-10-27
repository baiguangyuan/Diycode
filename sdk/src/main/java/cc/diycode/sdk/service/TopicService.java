package cc.diycode.sdk.service;

import cc.diycode.sdk.entity.ReplyItem;
import cc.diycode.sdk.entity.TopicContent;
import cc.diycode.sdk.entity.TopicItem;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public interface TopicService {

    @GET("topics.json")
    Call<List<TopicItem>> getTopicItems(@Query("type") String type, @Query("node_id") int node_id,
            @Query("offset") int offset, @Query("limit") int limit);

    @GET("topics.json/{id}")
    Call<TopicContent> getTopicContent(@Path("id") String id);

    @GET("/topics/{id}/replies.json")
    Call<List<ReplyItem>> getReplyItems(@Path("id") String id, @Query("offset") int offset, @Query("limit") int limit);

    @FormUrlEncoded
    @POST("topics.json")
    Call<TopicItem> createTopic(@Field("title") String title, @Field("body") String body, @Field("node_id") int node_id);
}
