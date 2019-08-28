package com.yaro.music.enums;

/**
 * 码率类型
 */
public enum QualityEnum {
    /**
     * 码率类型：48 96 128 192 320 ape flac
     */
    Q_48("48"),
    Q_96("96"),
    Q_128("128"),
    Q_192("192"),
    Q_320("320"),
    Q_APE("ape"),
    Q_FLAC("flac");

    QualityEnum(String quality){
            value=quality;
    }
    public String getValue(){
        return value;
    }
    private String value;
}
