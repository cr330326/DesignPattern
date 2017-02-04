/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.IDepartment;
import com.allen.designmodestudy.Interface.IFactory;
import com.allen.designmodestudy.Interface.IOperationFactory;
import com.allen.designmodestudy.Interface.IUser;
import com.allen.designmodestudy.Interface.Operation;

/**
 * Sqllite数据库工厂实现类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class SqlliteFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlliteUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlliteDepartment();
	}
}