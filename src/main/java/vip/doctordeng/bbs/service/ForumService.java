package vip.doctordeng.bbs.service;

import vip.doctordeng.bbs.pojo.entity.ForumEntity;

import java.util.List;
import java.util.Map;

public interface ForumService {
	List<ForumEntity> queryAllForumInfo();
	List<ForumEntity> queryUserAllForumInfo(final Integer user_id);
	List<ForumEntity> queryForumById(final Integer forum_id);
	int updateForumInfo(final Map dataMap);
}
