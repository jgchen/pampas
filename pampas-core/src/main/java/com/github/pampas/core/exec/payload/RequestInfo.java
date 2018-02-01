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

package com.github.pampas.core.exec.payload;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.opentracing.Span;
import io.opentracing.Tracer;
import org.asynchttpclient.uri.Uri;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by darrenfu on 18-1-24.
 *
 * @param <T> the type parameter
 * @author: darrenfu
 * @date: 18 -1-24
 */
public interface RequestInfo<T> {

    long getId();

    long getTimestamp();

    /**
     * Gets channel handler context.
     *
     * @return the channel handler context
     */
    ChannelHandlerContext getChannelHandlerContext();

    /**
     * Gets tracer.
     *
     * @return the tracer
     */
    Tracer getTracer();

    /**
     * Gets span.
     *
     * @return the span
     */
    Span getSpan();

    /**
     * Gets request.
     *
     * @return the request
     */
    T getRequestData();


    /**
     * 相对URI (eg. /resty/user/get?name=darrenfu)
     *
     * @return the uri
     */
    String getUri();

    /**
     * RestyCommand的请求路径 （eg. /resty/user/get）
     *
     * @return the path
     */
    String getPath();

    /**
     * RestyCommand的请求方式（GET/POST）
     *
     * @return the http method
     */
    String getHttpMethod();

    /**
     * RestyCommand对应的服务名称
     *
     * @return the service name
     */
    String getServiceName();

    /**
     * RestyCommand对应的method
     *
     * @return the service method
     */
    Method getServiceMethod();

    /**
     * 获取RestyCommand的返回类型
     *
     * @return the return type
     */
    Type getReturnType();

    /**
     * 获取RestyCommand的请求参数
     *
     * @return the object [ ]
     */
    Object[] getArgs();


}