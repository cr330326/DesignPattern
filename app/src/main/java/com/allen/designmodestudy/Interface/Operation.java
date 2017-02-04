/**
 * Operation 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Interface;

/**
 * 简单工厂运算抽象类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public abstract class Operation {

	public int numA;
	public int numB;

	public abstract int calculate();
}