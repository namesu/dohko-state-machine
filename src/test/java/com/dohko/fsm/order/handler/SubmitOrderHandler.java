package com.dohko.fsm.order.handler;

import com.dohko.fsm.Handler;
import com.dohko.fsm.StateMachineDomain;
import com.dohko.fsm.order.enums.OrderState;

/**
 * @description: 提交订单处理器
 * @author: luxiaohua
 * @date: 2020-07-08 16:30
 */
public class SubmitOrderHandler implements Handler<OrderState> {


    @Override
    public void handle(StateMachineDomain domain, OrderState orderState) {
        System.out.println(String.format("%s --> %s", domain.getCurrentState().toString(), orderState.toString()));
        domain.setNextState(orderState);

        System.out.println("========提交订单========");
    }
}
