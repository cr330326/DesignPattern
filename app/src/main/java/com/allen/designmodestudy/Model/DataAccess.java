/**
 * DataAccess 2016-09-22
 * Copyright (c) 2016 TYYD Co.Ltd. All right reserved
 */
package com.allen.designmodestudy.Model;

import com.allen.designmodestudy.Interface.IDepartment;
import com.allen.designmodestudy.Interface.IUser;

/**
 * 简单工厂数据库访问类
 * @author ChenRan
 * @since 2016-09-22
 * @version 1.0.0
 */
public class DataAccess {

	private static final int db = 0; //0-sqllite,1-file
	private static final String dbString = "com.allen.designmodestudy.Model.Sqllite";

	public static IUser CreateUser(){
		IUser iUser = null;
		switch (db){
			case 0:
				iUser = new SqlliteUser();
				break;
			case 1:
				iUser = new FileUser();
				break;
			default:
				break;
		}

		return iUser;
	}

	public static IDepartment CreateDepartment(){
		IDepartment iDepartment = null;
		switch (db){
			case 0:
				iDepartment = new SqlliteDepartment();
				break;
			case 1:
				iDepartment = new FileDepartment();
				break;
			default:
				break;
		}
		return iDepartment;
	}


	public static IUser CreateUserReflect() throws  ClassNotFoundException, InstantiationException, IllegalAccessException {

		try {
			Class<IUser> userImplClass= (Class<IUser>) Class.forName(dbString+"User");
			return userImplClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static IDepartment CreateDepartmentReflect()  throws  ClassNotFoundException, InstantiationException, IllegalAccessException{
		try {
			Class<IDepartment> departmentImplClass= (Class<IDepartment>) Class.forName(dbString+"Department");
			return departmentImplClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}