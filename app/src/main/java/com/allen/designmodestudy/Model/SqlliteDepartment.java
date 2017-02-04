/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import android.util.Log;

import com.allen.designmodestudy.Interface.IDepartment;
import com.allen.designmodestudy.Interface.IUser;

/**
 * 用Sqllite数据库访问部门表
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class SqlliteDepartment implements IDepartment {
	@Override
	public void insert(Department department){
		Log.d("SqlliteDepartment","在Sqllite数据库中增加一条部门记录");
	}

	@Override
	public User getDepartment(int id) {
		Log.d("SqlliteDepartment","在Sqllite数据库中获取一条部门记录");
		return null;
	}
}