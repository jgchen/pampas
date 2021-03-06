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

package com.github.df.pampas.common.base;

import java.net.URI;

/**
 * Created by darrenfu on 18-2-1.
 *
 * @author: darrenfu
 * @date: 18-2-1
 */
public class PampasConsts {

    public static final String CHARSET_UTF8 = "utf-8";

    public static final String DEFAULT_ROOM = "room";
    public static final String DEFAULT_SERVICE = "default-service";


    public static final URI LOCAL_URI = URI.create("HTTP://localhost");

    public static class Instance {
        /**
         * 权重属性
         */
        public static final String PROP_WEIGHT_KEY = "weight";

        public static final Integer PROP_WEIGHT_DEFAULT = 100;

        /**
         * 预热时间
         */
        public static final String PROP_WARMUP_KEY = "warmup";

        public static final Integer PROP_WARMUP_DEFAULT = 10 * 60 * 1000;

        /**
         * server开始服务时间
         */
        public static final String PROP_TIMESTAMP_KEY = "timestamp";
        public static final Long PROP_TIMESTAMP_DEFAULT = 0L;


        /**
         * server开始服务时间
         */
        public static final String PROP_VERSION_KEY = "version";
        public static final String PROP_VERSION_DEFAULT = "";
    }

}
