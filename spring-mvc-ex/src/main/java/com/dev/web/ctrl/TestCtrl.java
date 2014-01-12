package com.dev.web.ctrl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dev.web.vo.UserVO;

// TODO: Auto-generated Javadoc
/**
 * The Class TestCtrl.
 */
@Controller
@RequestMapping("/testctrl")
public class TestCtrl {

	/** The Constant LOG. */
	private final static Log LOG = LogFactory.getLog(TestCtrl.class);

	/**
	 * Load page.
	 * 
	 * @return the model and view
	 */
	public ModelAndView loadPage() {
		return new ModelAndView();
	}

	/**
	 * List.
	 * 
	 * @param httpServletRequest
	 *            the http servlet request
	 * @return the map
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public @ResponseBody
	Map<String, Object> list(HttpServletRequest httpServletRequest) {

		Enumeration<String> enumeration = httpServletRequest.getParameterNames();
		while (enumeration.hasMoreElements()) {
			String name = (String) enumeration.nextElement();
			LOG.info(name + " == " + httpServletRequest.getParameter(name));
		}

		final Map<String, Object> responseMap = new HashMap<String, Object>(1);
		Map<String, String> userMap = new HashMap<>();
		for (int i = 1; i <= 100; i++) {
			userMap.put("user", "user#" + i);
		}

		responseMap.put("data", userMap);
		responseMap.put("itemsPerPage", 10);
		responseMap.put("totalItems", userMap.size());

		return responseMap;
	}

	/**
	 * List users.
	 * 
	 * @return the model and view
	 */
	@RequestMapping("/userInfo")
	public ModelAndView listUsers() {
		final Collection<UserVO> users = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			users.add(new UserVO(i, "name#"+i, 30, "address " +i));
		}//for
		
		final ModelAndView modelAndView = new ModelAndView("user-info");
		modelAndView.addObject("users", users);
		return modelAndView;
	}

	/**
	 * Save.
	 * 
	 * @return the map
	 */
	@RequestMapping("save")
	public @ResponseBody
	Map<String, Object> save() {
		final Map<String, Object> responseMap = new HashMap<String, Object>(1);
		return responseMap;
	}

	/**
	 * Delete.
	 * 
	 * @return the map
	 */
	@RequestMapping(value = "delete", method = RequestMethod.DELETE)
	public @ResponseBody
	Map<String, Object> delete() {
		final Map<String, Object> responseMap = new HashMap<String, Object>(1);
		return responseMap;
	}
}
