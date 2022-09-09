package com.github.pingia.mvpannotation;

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
public @interface SingleFragmentPage {
    Class<?> fragmentClass();
}
