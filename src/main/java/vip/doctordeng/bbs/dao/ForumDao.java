package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.pojo.entity.ForumEntity;
/**
 * 
 * @ClassName:  ForumDao   
 * @Description:TODO 版块 DAO
 * @author: DoctorDeng
 * @date:   2017年3月5日 下午12:35:54   
 *
 */
public interface ForumDao {
	int insertForum(ForumEntity forumModule);
	int updateForumByCondition(Map condition);
	List<ForumEntity> listForumByCondition(Map condition);
	ForumEntity getForumByCondition(Map condition);
}
