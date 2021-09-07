package com.yhl.spider.task;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * 请求数据
 * @author : yhl
 * date : 2021-09-06
 */
@Data
@Builder
public class RequestData {

    private String url;

    private Map<String, String> data;

}
