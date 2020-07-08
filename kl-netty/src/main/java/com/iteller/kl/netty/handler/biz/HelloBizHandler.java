package com.iteller.kl.netty.handler.biz;

import com.iteller.kl.common.utils.JSONUtil;
import com.iteller.kl.netty.builder.TransportBuilder;
import com.iteller.kl.netty.dto.base.NettyReq;
import com.iteller.kl.netty.dto.base.NettyResp;
import com.iteller.kl.netty.dto.biz.HelloReq;
import com.iteller.kl.netty.dto.biz.HelloResp;
import com.iteller.kl.netty.handler.BizHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: 18060903(iTeller_zc)
 * date:2020/7/7 20:11
 * description:
 */
public class HelloBizHandler implements BizHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloBizHandler.class);

    @Override
    public NettyResp bizHandle(NettyReq nettyReq) {
        HelloReq helloReq = (HelloReq) nettyReq.getReq();
        LOGGER.info("hello req:{}.", JSONUtil.toStr(helloReq));
        HelloResp helloResp = new HelloResp("hello resp!");
        NettyResp nettyResp = TransportBuilder.buildResp(nettyReq.getNettyBaseHeader(), helloResp);
        return nettyResp;
    }
}
