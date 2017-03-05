package vip.doctordeng.bbs.dao;

import java.util.List;
import java.util.Map;

import vip.doctordeng.bbs.module.ReplyModule;

public interface ReplyDao {
	int insertReply(ReplyModule replyModule);
	List<ReplyModule> listReplyByCondition(Map conditon);
}
