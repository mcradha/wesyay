package com.wesay.dao;
import com.wesay.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
}