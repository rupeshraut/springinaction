package com.dev.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * The Class AuthorizationInterceptor.
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    /** The Constant LOG. */
    private static final Log LOG = LogFactory.getLog(AuthorizationInterceptor.class);

    /**
     * Pre handle.
     * 
     * @param request
     *            the request
     * @param response
     *            the response
     * @param handler
     *            the handler
     * @return true, if successful
     * @throws Exception
     *             the exception
     * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle
     *      (javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (LOG.isInfoEnabled()) {
            LOG.info("prehandle....");
        }//if
        final HttpSession httpSession = request.getSession(false);
        if (httpSession == null) {
            response.sendRedirect("/");
        }
        return true;
    }

    /**
     * Post handle.
     * 
     * @param request
     *            the request
     * @param response
     *            the response
     * @param handler
     *            the handler
     * @param modelAndView
     *            the model and view
     * @throws Exception
     *             the exception
     * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle
     *      (javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse, java.lang.Object,
     *      org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (LOG.isInfoEnabled()) {
            LOG.info("postHandle....");
            LOG.info(modelAndView.getViewName());
        }//if
    }

}
