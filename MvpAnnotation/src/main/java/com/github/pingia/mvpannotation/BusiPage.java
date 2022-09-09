package com.github.pingia.mvpannotation;

import androidx.annotation.LayoutRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Description:
 * Created by zenglulin@youxiang.com
 * <p>
 *
 *     这个元注解的作用是根据当前声明的类型，会构建不同的界面，如activity或fragment，（然后某个activity或fragment的具体类型）
 * Date: 2022/7/27
 */

@Target(ElementType.TYPE)
public @interface BusiPage {
    Class<?> basePresenter();   //presenter必须继承com.github.pingia.ui.framework.architecture.BasePresenter并实现IResponseDataHandler接口
    PageTypeEnum pageType() default PageTypeEnum.NO_PAGE; //1-activity  2-baseloadingfragment  3-listfragment...
    String busiName();  //根据该业务名称生成相关名称
    @LayoutRes int pageLayoutId() default -1;  //页面内容布局id
    @LayoutRes int pageTitleLayoutId() default -1; //页面标题布局id
}
