/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import android.util.Log;

import com.allen.designmodestudy.Interface.IUser;

/**
 * 用File文件访问人员
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class FileUser implements IUser {
	
	@Override
	public void insert(User user) {
		Log.d("FileUser","在File文件中增加一条记录");
	}

	@Override
	public User getUser(int id) {
		Log.d("FileUser","在File文件中获取User的一条记录");
		return null;
	}
}