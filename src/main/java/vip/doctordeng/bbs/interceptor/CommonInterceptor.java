package vip.doctordeng.bbs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * @ClassName:  CommonInterceptor   
 * @Description:TODO 公共 拦截器
 * @author: DoctorDeng
 * @date:   2017年4月5日 下午4:38:37   
 *
 */
public class CommonInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		final String path     = request.getContextPath();
		final String basePath = request.getScheme() + "://" 
								+ request.getServerName() 
								+ ":" + request.getServerPort()
								+ path + "/";
		final String staticBasePath = basePath + "static";
		request.setAttribute("", "");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
