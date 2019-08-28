package com.yaro.music.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class SongInfo {
    //private Preview preview;

    private String songname_hilight;

    private Long belongCD;

    private Long newStatus;

    private List<Singer> singer ;

    private String albumname_hilight;

    private String lyric_hilight;

    private Long nt;

    private String songmid;

    private Long pure;

    private Long type;

    private Long chinesesinger;

    @JsonProperty(value = "switch")
    private Long switchId;

    private String albumname;

    private String vid;

    private Long stream;

    private Long tag;

    private Long ver;

    private Long isonly;

    //private List<Grp> grp ;

    private String docid;

    private String albummid;

    private Long albumid;

    private Long msgid;

    //private Pay pay;

    private Long size128;

    private Long sizeflac;

    private Long sizeogg;

    private String songname;

    private Long size320;

    private String strMediaMid;

    private String media_mid;

    private Long t;

    private String lyric;

    private Long sizeape;

    private Long pubtime;

    private Long interval;

    private Long alertid;

    private Long cdIdx;

    private Long songid;
}
