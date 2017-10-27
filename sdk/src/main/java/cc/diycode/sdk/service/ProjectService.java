package cc.diycode.sdk.service;

import cc.diycode.sdk.entity.ProjectItem;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public interface ProjectService {

    @GET("projects.json")
    Call<List<ProjectItem>> getProjectItems(@Query("node_id") int node_id, @Query("offset") int offset, @Query("limit") int limit);

}
