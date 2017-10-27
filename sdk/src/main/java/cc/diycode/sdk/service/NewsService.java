package cc.diycode.sdk.service;

import cc.diycode.sdk.entity.NewsItem;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public interface NewsService {

    @GET("news.json")
    Call<List<NewsItem>> getNewsItems(@Query("node_id") int node_id, @Query("offset") int offset, @Query("limit") int limit);

    @FormUrlEncoded
    @POST("news.json")
    Call<NewsItem> createNews(@Field("title") String title, @Field("address") String address, @Field("node_id") int node_id);
}
