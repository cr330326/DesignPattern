/**
 * OperationFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.Operation;

/**
 * 简单工厂类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class OperationFactory {

	public static Operation createOperation(int type){
		Operation oper = null;
		switch (type){
			case 1:
				oper = new OperationAdd();
				break;
			case 2:
				oper = new OperationSub();
				break;
			case 3:
				oper = new OperationMul();
				break;
			case 4:
				oper = new OperationDiv();
				break;
			default:
				break;
		}
		return oper;
	}
}