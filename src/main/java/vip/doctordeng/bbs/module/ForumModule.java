package vip.doctordeng.bbs.module;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @ClassName:  ForumModule   
 * @Description:TODO 板块实体类
 * @author: DoctorDeng  
 * @date:   2017年2月27日 下午9:37:34   
 *
 */
@Data
@NoArgsConstructor
public class ForumModule {
	private Integer fornum_id;
	private String  fornum_name;
	private String  forum_intruction;
	private Integer user_id;
	private Integer forum_parent_id;
	/**
	 * 板块状态: 0 正常。1 被删除；
	 */
	private Integer forum_status;
	private String  prop1;
	private String  prop2;
	private String  prop3;
	private String  prop4;
	private String  prop5;
	private String  prop6;
	private String  prop7;
	private String  prop8;
	private String  prop9;
	private String  prop10;
}
