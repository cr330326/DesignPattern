/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.IDepartment;
import com.allen.designmodestudy.Interface.IFactory;
import com.allen.designmodestudy.Interface.IUser;

/**
 * File文件工厂实现类
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class FileFactory implements IFactory {
	
	@Override
	public IUser createUser() {
		return new FileUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new FileDepartment();
	}
}