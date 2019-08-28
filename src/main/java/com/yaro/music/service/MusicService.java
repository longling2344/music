package com.yaro.music.service;

import com.yaro.music.enums.QualityEnum;
import com.yaro.music.enums.SearchType;
import com.yaro.music.feign.MusicApi;
import com.yaro.music.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author eyfnane
 */
@Service
public class MusicService {

    private static final String OK = "OK";
    private final int pageSize = 9;
    private final int page = 0;
    private MusicApi musicApi;

    @Autowired
    public MusicService(MusicApi musicApi) {
        this.musicApi = musicApi;
    }

    private SearchParameter getDefaultParam(String keyword){
        return SearchParameterBuilder
                .build()
                .keyword(keyword)
                .pageSize(pageSize)
                .page(page)
                .type(SearchType.SONG)
                .getParams();
    }

    public String searchSongId(String songName) {
        List<SongInfo> list=  getSongInfoList(songName);
        return list.get(0).getSongmid();
    }

    public List<SongInfo> getSongInfoList(String keyword){
        ResultMusicApi<SongData> result = musicApi.searchSongList(getDefaultParam(keyword));
        if (result.getMsg().equals(OK)&&!result.getData().getList().isEmpty()) {
            return result.getData().getList();
        }
        return Collections.singletonList(new SongInfo());
    }

    public String getPlayUrl(String songId){
      SearchParameter parameter =  SearchParameterBuilder
                .build()
                .id(songId)
                .quality(QualityEnum.Q_320.getValue())
                .getParams();
        ResultMusicApi<List<String>> result = musicApi.getPlayUrl(parameter);
        return result.getData().get(0);

    }
}
