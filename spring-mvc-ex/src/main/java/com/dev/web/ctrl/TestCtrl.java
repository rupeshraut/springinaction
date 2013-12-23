package com.dev.web.ctrl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	 * @return the map
	 */
	@RequestMapping("list")
	public @ResponseBody
	Map<String, Object> list() {
		final Map<String, Object> responseMap = new HashMap<String, Object>(1);
		return responseMap;
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
