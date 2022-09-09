package com.github.pingia.mvpannotation;

/**
 * Description:
 * Created by zenglulin@youxiang.com
 * <p>
 * Date: 2022/7/28
 */
public enum PageTypeEnum {
    NO_PAGE(-1),
    BASE_ACTIVITY(1),
    BLOCKING_ACTIVITY(3),
    SINGLE_FRAGMENT_ACTIVITY(5),

    BASE_FRAGMENT(2),
    BLOCKING_FRAGMENT(4),
    NOT_BLOCKING_FRAGMENT(6),
    LOADING_LIST_FRAGMENT(8),
    WEB_FRAGMENT(10);


    private int mType;
    PageTypeEnum(int type){
        this.mType = type;
    }

    public int getPageType(){
        return this.mType;
    }
}
