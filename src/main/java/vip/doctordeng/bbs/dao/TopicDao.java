package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.module.TopicModule;

public interface TopicDao {
	int insertTopic(TopicModule topicModule);
	List<TopicModule> listTopicByCondition(Map condition);
	int updateTopicByCondition(Map condition);
}
