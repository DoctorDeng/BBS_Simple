package vip.doctordeng.bbs.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class TopicVo {
	private Integer user_id;
	private String user_ico_url;
	private String user_name;
	private String user_sex;

	private Integer topic_id;
	private String  topic_title;
	private String publish_time;
	private String publish_content;

	private String forum_name;
	// 楼层
	private Integer reply_floor;
	// 标识：0 楼主, 1 回复,
	private int sign;

	public static TopicVo covert(Map map){
		TopicVo topicVo = new TopicVo();
		if (null != map.get("user_id")) topicVo.setUser_id(Integer.parseInt(map.get("user_id").toString()));
		if (null != map.get("user_ico_url")) topicVo.setUser_ico_url(map.get("user_ico_url").toString());
		if (null != map.get("user_name")) topicVo.setUser_ico_url(map.get("user_name").toString());
		if (null != map.get("user_sex")) topicVo.setUser_ico_url(map.get("user_sex").toString());
		if (null != map.get("topic_id")) topicVo.setUser_id(Integer.parseInt(map.get("topic_id").toString()));
		if (null != map.get("topic_title")) topicVo.setUser_ico_url(map.get("topic_title").toString());
		if (null != map.get("publish_time")) topicVo.setUser_ico_url(map.get("publish_time").toString());
		if (null != map.get("publish_content")) topicVo.setUser_ico_url(map.get("publish_content").toString());
		if (null != map.get("forum_name")) topicVo.setUser_ico_url(map.get("forum_name").toString());
		if (null != map.get("reply_floor")) topicVo.setUser_id(Integer.parseInt(map.get("reply_floor").toString()));
		if (null != map.get("sign")) topicVo.setUser_id(Integer.parseInt(map.get("sign").toString()));
		return topicVo;
	}
	public static List<TopicVo> coverList(List<Map> maps) {
		List<TopicVo> topicVos  = new ArrayList<>();

		if (maps == null) return topicVos;
		for (int i = 0, len = maps.size(); i < len; i++) {
			TopicVo topicVo = covert(maps.get(i));
			topicVos.add(topicVo);
		}
		return  topicVos;
	}
}
