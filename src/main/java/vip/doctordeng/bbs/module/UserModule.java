package vip.doctordeng.bbs.module;

public class UserModule {
	private Integer user_id;
	private String  user_password;
	private String  user_name;
	private String  user_introduction;
	/**
	 * 用户性别,0 无即未设置；1 男；2 女；
	 */
	private Integer user_sex;
	private String  user_ico_url;
	private String  user_email;
	// 用户积分
	private Integer user_integal;
	/**
	 * 用户类型。0 新注册未激活账号；1 普通已激活账号用户；2 管理员；
	 */
	private Integer user_type;
	/**
	 * 用户账号状态。0 正常；1 被删除，账号无效；2 用户无法发帖；
	 */
	private Integer user_status;
	private java.sql.Timestamp user_register_time;
	private String prop1;
	private String prop2;
	private String prop3;
	private String prop4;
	private String prop5;
	private String prop6;
	private String prop7;
	private String prop8;
	private String prop9;
	private String prop10;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_introduction() {
		return user_introduction;
	}
	public void setUser_introduction(String user_introduction) {
		this.user_introduction = user_introduction;
	}
	public Integer getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(Integer user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_ico_url() {
		return user_ico_url;
	}
	public void setUser_ico_url(String user_ico_url) {
		this.user_ico_url = user_ico_url;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Integer getUser_integal() {
		return user_integal;
	}
	public void setUser_integal(Integer user_integal) {
		this.user_integal = user_integal;
	}
	public Integer getUser_type() {
		return user_type;
	}
	public void setUser_type(Integer user_type) {
		this.user_type = user_type;
	}
	public Integer getUser_status() {
		return user_status;
	}
	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}
	public java.sql.Timestamp getUser_register_time() {
		return user_register_time;
	}
	public void setUser_register_time(java.sql.Timestamp user_register_time) {
		this.user_register_time = user_register_time;
	}
	public String getProp1() {
		return prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	public String getProp2() {
		return prop2;
	}
	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}
	public String getProp3() {
		return prop3;
	}
	public void setProp3(String prop3) {
		this.prop3 = prop3;
	}
	public String getProp4() {
		return prop4;
	}
	public void setProp4(String prop4) {
		this.prop4 = prop4;
	}
	public String getProp5() {
		return prop5;
	}
	public void setProp5(String prop5) {
		this.prop5 = prop5;
	}
	public String getProp6() {
		return prop6;
	}
	public void setProp6(String prop6) {
		this.prop6 = prop6;
	}
	public String getProp7() {
		return prop7;
	}
	public void setProp7(String prop7) {
		this.prop7 = prop7;
	}
	public String getProp8() {
		return prop8;
	}
	public void setProp8(String prop8) {
		this.prop8 = prop8;
	}
	public String getProp9() {
		return prop9;
	}
	public void setProp9(String prop9) {
		this.prop9 = prop9;
	}
	public String getProp10() {
		return prop10;
	}
	public void setProp10(String prop10) {
		this.prop10 = prop10;
	}
}
