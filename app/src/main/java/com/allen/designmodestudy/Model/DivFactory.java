/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.IOperationFactory;
import com.allen.designmodestudy.Interface.Operation;

/**
 * 工厂模式除法类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class DivFactory implements IOperationFactory {

	@Override
	public Operation createOperation() {
		 return new OperationDiv();
	}
}