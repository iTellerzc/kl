package com.iteller.kl.netty.handler.heartbeat;

import com.iteller.kl.netty.dto.base.ReqTransport;
import com.iteller.kl.netty.dto.base.RespTransport;
import com.iteller.kl.netty.handler.BizHandler;

/**
 * @author: 18060903(iTeller_zc)
 * date:2020/7/8 9:57
 * description:
 */
public class HeartBeatHandler implements BizHandler {

    @Override
    public RespTransport bizHandle(ReqTransport nettyReq) {
        return null;
    }
}