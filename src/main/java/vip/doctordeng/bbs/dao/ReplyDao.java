package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.pojo.entity.ReplyEntity;

public interface ReplyDao {
	int insertReply(ReplyEntity replyModule);
	List<ReplyEntity> listReplyByCondition(Map conditon);
}
