package vip.doctordeng.bbs.dao;

import vip.doctordeng.bbs.pojo.entity.TopicEntity;

import java.util.List;
import java.util.Map;

public interface TopicDao {
	int insertTopic(TopicEntity topicModule);
	List<TopicEntity> listTopicByCondition(Map condition);
	int updateTopicByCondition(Map condition);
}
