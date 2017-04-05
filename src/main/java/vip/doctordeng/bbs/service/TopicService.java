package vip.doctordeng.bbs.service;

import java.util.List;
import java.util.Map;

public interface TopicService {
	List<Map> querySimpleTopicByPage(Map queryMap);
	//void queryDetailTopic(final detail);
}
