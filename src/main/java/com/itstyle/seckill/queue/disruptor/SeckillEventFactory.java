package com.itstyle.seckill.queue.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * 事件生成工厂（用来初始化预分配事件对象）
 * 创建者 xiaotian
 */
public class SeckillEventFactory implements EventFactory<SeckillEvent> {

	public SeckillEvent newInstance() {
		return new SeckillEvent();
	}
}
