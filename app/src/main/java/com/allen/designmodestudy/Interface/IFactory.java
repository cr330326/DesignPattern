/**
 * IOperationFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Interface;

import com.allen.designmodestudy.Model.User;

/**
 * 工厂接口
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public interface IFactory {
	IUser createUser();

	IDepartment createDepartment();
}