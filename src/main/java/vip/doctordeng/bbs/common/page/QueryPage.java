package vip.doctordeng.bbs.common.page;

import java.util.HashMap;
import java.util.Map;

public class QueryPage extends HashMap {
	public QueryPage(final int start, final int size, final Map queryData) {
		if (null != queryData) {
			this.putAll(queryData);
		}
		this.put("start", start);
		this.put("size", size);
	}
	
	public static void main(String[] args) {
		QueryPage queryPage = new QueryPage(2, 2, null);
		System.out.println(queryPage.get("aaa"));
	}
}
