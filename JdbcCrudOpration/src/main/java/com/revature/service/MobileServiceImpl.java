package com.revature.service;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Mobile;

import ccm.revature.dao.DaoLayer;

public class MobileServiceImpl implements MobileService {
	
	DaoLayer dao=new DaoLayer();

	public void MobileForm() {
	
		try {
			dao.saveMobile();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void listShow() throws ClassNotFoundException, SQLException {
		dao.getAll();
		
	}

	public void removeMobile(int id) throws ClassNotFoundException, SQLException {
		dao.remove( id);
		
	}

	public void updateInfo() throws ClassNotFoundException, SQLException {
		dao.updateMobile();
		
	}

	public void getInfo(int id2) throws ClassNotFoundException, SQLException {
		dao.getmobilebyModel(id2);
		
	}

}
