/*
 *
 *  *  Copyright 2009-2018.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.github.df.pampas.common.extension;

import java.lang.annotation.*;

/**
 * @author maijunsheng
 * @version 创建时间：2013-5-28
 *
 * -> motan
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SpiMeta {
    String name() default "";

    /**
     * seq号越小，在返回的list<Instance>中的位置越靠前，尽量使用 0-100以内的数字
     */
    int order() default 20;

    /**
     * spi 的key，获取spi列表时，根据key进行匹配，当key中存在待过滤的search-key时，匹配成功
     */
    String[] key() default "";

    /**
     * 是否支持重试的时候也调用
     */
    boolean retry() default true;
}
