package com.github.pingia.mvpannotation;

/**
 * Description:
 * Created by zenglulin@youxiang.com
 * <p>
 * Date: 2022/7/27
 */
public @interface ListQueryMethod {
    boolean isFenye() default false;     //查列表接口时，是否分页查询,默认否
    int perSize() default 10;   //分页查询，每次查询数量
}
