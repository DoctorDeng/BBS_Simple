package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.pojo.entity.TopicEntity;

public interface TopicDao {
	int insertTopic(TopicEntity topicModule);
	List<TopicEntity> listTopicByCondition(Map condition);
	int updateTopicByCondition(Map condition);
}
