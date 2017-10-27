package cc.diycode.sdk;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public class DiycodeApi {

    private volatile static DiycodeApi sDiycodeApi;

    public static DiycodeApi getInstance() {
        if (sDiycodeApi == null) {
            synchronized (DiycodeApi.class) {
                if (sDiycodeApi == null) {
                    sDiycodeApi = new DiycodeApi();
                }
            }
        }
        return sDiycodeApi;
    }

    private Retrofit mRetrofit;

    private DiycodeApi() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://diycode.cc/api/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}
