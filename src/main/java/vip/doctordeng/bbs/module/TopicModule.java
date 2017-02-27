package vip.doctordeng.bbs.module;

public class TopicModule {
	private Integer  topic_id;
	private String   topic_intruction;
	private String   topic_title;
	private String   topic_content;
	/**
	 * 帖子类型。
	 * 0：普通贴。1 精华帖。2 公告贴。
	 */
	private Integer  topic_type;
	// 帖子浏览数量。每次浏览都算一次，即使是同一用户
	private Integer  topic_view_num;
	/**
	 * 帖子状态。0 正常； 1 被删除。
	 */
	private Integer  topic_status;
	private Integer  topic_good_num;
	// 帖子所属板块 id
	private Integer  forum_id;
	// 发表帖子用户 id
	private Integer  user_id;
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
	
	public Integer getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(Integer topic_id) {
		this.topic_id = topic_id;
	}
	public String getTopic_intruction() {
		return topic_intruction;
	}
	public void setTopic_intruction(String topic_intruction) {
		this.topic_intruction = topic_intruction;
	}
	public String getTopic_title() {
		return topic_title;
	}
	public void setTopic_title(String topic_title) {
		this.topic_title = topic_title;
	}
	public String getTopic_content() {
		return topic_content;
	}
	public void setTopic_content(String topic_content) {
		this.topic_content = topic_content;
	}
	public Integer getTopic_type() {
		return topic_type;
	}
	public void setTopic_type(Integer topic_type) {
		this.topic_type = topic_type;
	}
	public Integer getTopic_view_num() {
		return topic_view_num;
	}
	public void setTopic_view_num(Integer topic_view_num) {
		this.topic_view_num = topic_view_num;
	}
	public Integer getTopic_status() {
		return topic_status;
	}
	public void setTopic_status(Integer topic_status) {
		this.topic_status = topic_status;
	}
	public Integer getTopic_good_num() {
		return topic_good_num;
	}
	public void setTopic_good_num(Integer topic_good_num) {
		this.topic_good_num = topic_good_num;
	}
	public Integer getForum_id() {
		return forum_id;
	}
	public void setForum_id(Integer forum_id) {
		this.forum_id = forum_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
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
