/**
 * AddFactory 2016-09-14
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import android.util.Log;

import com.allen.designmodestudy.Interface.IDepartment;

/**
 * 用File文件访问部门表
 * @author ChenRan
 * @since 2016-09-14
 * @version 1.0.0
 */
public class FileDepartment implements IDepartment {
	@Override
	public void insert(Department department){
		Log.d("FileDepartment","在File文件中增加一条部门记录");
	}

	@Override
	public User getDepartment(int id) {
		Log.d("FileDepartment","在File文件中获取一条部门记录");
		return null;
	}
}