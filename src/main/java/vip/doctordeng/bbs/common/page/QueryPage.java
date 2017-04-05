package vip.doctordeng.bbs.common.page;

import java.util.HashMap;
import java.util.Map;

public class QueryPage extends HashMap {
	public QueryPage(final int pageSize, final int queryIndex, final Map queryData) {
		this.putAll(queryData);
		this.put("pageSize", pageSize);
		this.put("queryIndex", queryIndex);
	}
	
	public static void main(String[] args) {
		QueryPage queryPage = new QueryPage(2, 2, new HashMap() {{put("aaa","ddd");}});
		System.out.println(queryPage.get("aaa"));
	}
}
