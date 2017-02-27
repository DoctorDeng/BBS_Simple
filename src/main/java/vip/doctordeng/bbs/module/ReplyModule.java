package vip.doctordeng.bbs.module;
/**
 * 
 * @ClassName:  ReplyModule   
 * @Description:TODO 帖子回复实体类
 * @author: DoctorDeng
 * @date:   2017年2月27日 下午9:39:26   
 *
 */
public class ReplyModule {
	private Integer reply_id;
	private Integer topic_id;
	private String  reply_content;
	private Integer user_id;
	private Integer reply_user_id;
	private Integer reply_status;
	private java.sql.Timestamp reply_time;
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
	
	public Integer getReply_id() {
		return reply_id;
	}
	public void setReply_id(Integer reply_id) {
		this.reply_id = reply_id;
	}
	public Integer getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}
	public String getReply_content() {
		return reply_content;
	}
	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getReply_user_id() {
		return reply_user_id;
	}
	public void setReply_user_id(Integer reply_user_id) {
		this.reply_user_id = reply_user_id;
	}
	public Integer getReply_status() {
		return reply_status;
	}
	public void setReply_status(Integer reply_status) {
		this.reply_status = reply_status;
	}
	public java.sql.Timestamp getReply_time() {
		return reply_time;
	}
	public void setReply_time(java.sql.Timestamp reply_time) {
		this.reply_time = reply_time;
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
