package com.yaro.music.model;

import com.yaro.music.enums.SearchType;
import lombok.Data;

@Data
public class SearchParameter {
    private String keyword;//	√	搜索关键词	详细见下面说明
    private String type;// 搜索类型	默认为 song
    private Integer pageSize;//	×	请求数量	默认为 30
    private Integer page;//分页	默认第 0 页
    private String format;//x	格式化数据(仅格式化音乐搜索) 1 格式化 0 不格式化	0

    private String id;	//√	音乐 ID	无
    private String quality;//	√	音质 如果最大音质获取出错则自动转其他音质	默认 192
    private String isRedirect;//	×	是否 302 跳转 1 跳转 0 不跳转 默认为跳转

    public void setType(SearchType searchType) {
        this.type = searchType.toString().toLowerCase();
    }
}
