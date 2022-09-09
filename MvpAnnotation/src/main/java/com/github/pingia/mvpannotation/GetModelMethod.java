package com.github.pingia.mvpannotation;

/**
 * Description:
 * Created by zenglulin@youxiang.com
 * <p>
 * Date: 2022/7/27
 */
public @interface GetModelMethod {
    boolean isAsync() default true;
    boolean showSuccessResultMsg() default false;   //是否toast提示接口业务成功信息
    boolean showFailResultMsg() default true;   //是否toast提示接口业务失败信息
    boolean showBlockLoading() default false;   //是否在请求接口时，显示全局阻塞对话框

    String desc() default "";
    int descResId() default  -1;
}
