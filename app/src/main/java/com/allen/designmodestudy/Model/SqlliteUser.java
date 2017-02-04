/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import android.util.Log;

import com.allen.designmodestudy.Interface.IUser;

/**
 * 用Sqllite数据库访问人员表
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class SqlliteUser implements IUser {

	@Override
	public void insert(User user) {
		Log.d("SqlliteUser","在Sqllite数据库中增加一条人员记录");
	}

	@Override
	public User getUser(int id) {
		Log.d("SqlliteUser","在Sqllite数据库中获取一条人员记录");
		return null;
	}
}