package com.yaro.music.model;

import com.yaro.music.enums.SearchType;

/**
 * @author eyfnane
 */
public class SearchParameterBuilder {
    private static SearchParameter searchParameter;

    public static SearchParameterBuilder build() {
        searchParameter = new SearchParameter();
        return new SearchParameterBuilder();
    }

    public SearchParameterBuilder id(String id) {
        searchParameter.setId(id);
        return this;
    }
    public SearchParameterBuilder type(SearchType type) {
        searchParameter.setType(type);
        return this;
    }
    public SearchParameterBuilder isRedirect(boolean isRedirect) {
        searchParameter.setIsRedirect(isRedirect?"1":"0");
        return this;
    }
    public SearchParameterBuilder quality(String quality) {
        searchParameter.setQuality(quality);
        return this;
    }
    public SearchParameterBuilder keyword(String keyword) {
        searchParameter.setKeyword(keyword);
        return this;
    }

    public SearchParameterBuilder page(Integer page) {
        searchParameter.setPage(page);
        return this;
    }

    public SearchParameterBuilder pageSize(Integer pageSize) {
        searchParameter.setPageSize(pageSize);
        return this;
    }

    public SearchParameter getParams() {
        return searchParameter;
    }
}