package com.allen.designmodestudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.allen.designmodestudy.Interface.IDepartment;
import com.allen.designmodestudy.Interface.IFactory;
import com.allen.designmodestudy.Interface.IOperationFactory;
import com.allen.designmodestudy.Interface.IUser;
import com.allen.designmodestudy.Interface.Operation;
import com.allen.designmodestudy.Model.DataAccess;
import com.allen.designmodestudy.Model.Department;
import com.allen.designmodestudy.Model.MulFactory;
import com.allen.designmodestudy.Model.OperationFactory;
import com.allen.designmodestudy.Model.SqlliteDepartment;
import com.allen.designmodestudy.Model.SqlliteFactory;
import com.allen.designmodestudy.Model.SqlliteUser;
import com.allen.designmodestudy.Model.User;

public class MainActivity extends AppCompatActivity {
	private final static String TAG =  MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	/**
	* 初始化操作
	* @author allen chen
	* created at 2016-9-14
	*/
	private void init(){
		//simpleTest();
		//factoryTest();
		abstractFactoryTest();
	}

	//简单工厂-计算器
	private void simpleTest(){
		Operation operOne,openTwo;
		operOne = OperationFactory.createOperation(1);
		operOne.numA = 1;
		operOne.numB = 2;
		int resultOne = operOne.calculate();
		Log.d(TAG,"simpleTest First result:"+resultOne);

		openTwo = OperationFactory.createOperation(2);
		openTwo.numA = 100;
		openTwo.numB = 30;
		int resultTwo = openTwo.calculate();
		Log.d(TAG,"simpleTest Second result:"+resultTwo);
	}

	//工厂模式-计算器
	private void factoryTest(){
		IOperationFactory operFactory = new MulFactory();
		Operation oper = operFactory.createOperation();
		oper.numA = 2;
		oper.numB = 10;
		int result = oper.calculate();
		Log.d(TAG,"factoryTest result:"+result);
	}


	//抽象工厂-访问数据库
	private void abstractFactoryTest(){
		//normalTest();
		//simpleFactoryTest();
		reflectTest();
	}

	//普通用法
	private void normalTest(){
		User user = new User();
		Department department = new Department();

		IFactory factory = new SqlliteFactory();

		IUser iUser = factory.createUser();
		iUser.insert(user);
		iUser.getUser(1);

		IDepartment iDepartment = factory.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(1);
	}

	//简单工厂用法
	private void simpleFactoryTest(){
		User user1 = new User();
		Department department1 = new Department();

		IUser iUser1 = DataAccess.CreateUser();
		iUser1.insert(user1);
		iUser1.getUser(1);

		IDepartment iDepartment1 = DataAccess.CreateDepartment();
		iDepartment1.insert(department1);
		iDepartment1.getDepartment(1);
	}


	//反射用法
	private void reflectTest(){
		User user2 = new User();
		Department department2 = new Department();

		try {
			IUser iUser2 = DataAccess.CreateUserReflect();
			iUser2.insert(user2);
			iUser2.getUser(1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}


		IDepartment iDepartment2 = null;
		try {
			iDepartment2 = DataAccess.CreateDepartmentReflect();
			iDepartment2.insert(department2);
			iDepartment2.getDepartment(1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
