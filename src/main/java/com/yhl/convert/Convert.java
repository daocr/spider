package com.yhl.convert;

/**
 * 数据转换
 *
 * @author : yhl
 * date : 2021-09-06
 */
public interface Convert<OUT> {

    OUT convert(String data);
}
