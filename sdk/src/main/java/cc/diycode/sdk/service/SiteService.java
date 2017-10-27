package cc.diycode.sdk.service;

import cc.diycode.sdk.entity.SiteCategoryItem;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public interface SiteService {

    @GET("sites.json")
    Call<List<SiteCategoryItem>> getSiteCategoryItems();
}
