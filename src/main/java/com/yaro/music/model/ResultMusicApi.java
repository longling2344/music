package com.yaro.music.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author eyfnane
 */
@Data
public class ResultMusicApi<T> implements Serializable {
    private Integer code;

    private String msg;

    private Long timestamp;

    private T data;
}
