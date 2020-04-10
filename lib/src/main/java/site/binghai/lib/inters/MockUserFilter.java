package site.binghai.lib.inters;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import site.binghai.lib.entity.WxUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MockUserFilter extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        HttpSession session = request.getSession();
        if (session != null) {
            Object obj = session.getAttribute("__WXUSER__");
            if (obj == null) {
                session.setAttribute("__WXUSER__", mockUser());
            }
        }
        return true;
    }

    private WxUser mockUser() {
        return null;
    }

}