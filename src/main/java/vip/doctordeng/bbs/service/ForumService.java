package vip.doctordeng.bbs.service;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.common.page.CommonPage;
import vip.doctordeng.bbs.pojo.entity.ForumEntity;

public interface ForumService {
	List<ForumEntity> queryAllForumInfo();
	List<ForumEntity> queryUserAllForumInfo(final Integer user_id);
	List<ForumEntity> queryForumById(final Integer forum_id);
	int updateForumInfo(final Map dataMap);
}
