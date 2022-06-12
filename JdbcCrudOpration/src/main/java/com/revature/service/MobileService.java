package com.revature.service;

import java.sql.SQLException;
import java.util.List;

import com.revature.model.Mobile;

public interface MobileService {

	void MobileForm();

	void listShow() throws ClassNotFoundException, SQLException;

	void removeMobile(int id) throws ClassNotFoundException, SQLException;

	void updateInfo() throws ClassNotFoundException, SQLException;

	void getInfo(int id2) throws ClassNotFoundException, SQLException;

}