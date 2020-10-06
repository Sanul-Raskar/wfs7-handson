package com.org.model.util;

import com.org.model.dao.AccountDao;
import com.org.model.dao.CollectionBackedAccountDaoImpl;
import com.org.model.service.AccountService;
import com.org.model.service.AccountServiceImpl;

public class ObjectFactory {
	public static AccountDao getAccountDaoInstance() {
		return new CollectionBackedAccountDaoImpl();
	}
	
	public static AccountService getAccountServiceInstance() {
		return new AccountServiceImpl();
	}
	
	public static Object getInstance(String type) {
		if(type.equals("dao")) {
			return new CollectionBackedAccountDaoImpl();
		}
		if(type.equals("service")) {
			return new AccountServiceImpl();
		}
		return null;
	}
}
