package vip.doctordeng.bbs.common.constant;
/**
 * 
 * @ClassName:  ForumConstant   
 * @Description:TODO 与 Forum (版块) 相关的一些常量
 * @author: DoctorDeng
 * @date:   2017年3月5日 下午12:19:44   
 *
 */
public interface ForumConstant extends Constant {
	 // 查找指定用户所拥有的版块
	final String LIST_USER_FORUM = "listUserForum";
	// 查找所有版块
	final String LIST_ALL_FORUM  = "listAllForum";
	// 查找指定版块下的所有子版块
	final String LIST_FORUMCHILD = "listForumChild";
	// 查找指定版块及其所有子版块信息
	final String LIST_FORUMANDCHILD = "listForumAndChild";
}
