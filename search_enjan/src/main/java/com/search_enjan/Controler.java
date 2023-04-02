package com.search_enjan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Controler {

	@RequestMapping("search")
	public String search() {

		// rv.setUrl("https://www.google.com/search?q=" + search);
		return "search";

	}

	@RequestMapping("findpage")
	public RedirectView find(@RequestParam("textvalue") String search) {
		RedirectView rv = new RedirectView();
		rv.setUrl("https://www.google.com/search?q=" + search);
		return rv;
	}

	

}
