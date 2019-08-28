package com.yaro.music.model;

import lombok.Data;

import java.util.List;
@Data
public class SongData {
    private Long curnum;

    private Long curpage;

    private Long totalnum;

    private List<SongInfo> list ;
}
