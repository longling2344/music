package com.yaro.music.feign;


import com.yaro.music.model.ResultMusicApi;
import com.yaro.music.model.SearchParameter;
import com.yaro.music.model.SongData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author eyfnane
 */
@FeignClient(name = "musicApi", url = "https://v1.itooi.cn/tencent/")
public interface MusicApi {
    @GetMapping("search")
    ResultMusicApi<SongData> searchSongList(@SpringQueryMap SearchParameter parameter);

    @GetMapping("url")
    ResultMusicApi<List<String>> getPlayUrl(@SpringQueryMap SearchParameter parameter);
}
