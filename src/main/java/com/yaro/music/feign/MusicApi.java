package com.yaro.music.feign;


import com.yaro.music.model.ResultMusicApi;
import com.yaro.music.model.SearchParameter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author eyfnane
 */
@FeignClient(name = "musicApi", url = "https://v1.itooi.cn/tencent/")
public interface MusicApi<T> {
    @GetMapping("search")
    ResultMusicApi<T> searchSongList(@SpringQueryMap SearchParameter parameter);
}
