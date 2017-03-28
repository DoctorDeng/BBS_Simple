package vip.doctordeng.bbs.service;

public interface LoginService {
	public boolean checkUserById(final Integer user_id);
	public boolean checkUserByAccountAndPassword(final String user_account, final String user_password);
}
