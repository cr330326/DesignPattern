/**
 * OperationSub 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.Operation;

/**
 * 简单工厂减法类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class OperationSub extends Operation {

	@Override
	public int calculate() {
		return numA - numB;
	}
}