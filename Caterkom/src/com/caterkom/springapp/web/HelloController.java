package com.caterkom.springapp.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping("/inicio")
    public ModelAndView inicio(Model model){
        return new ModelAndView("inicio");
	}
	
	@RequestMapping("/aboutus")
    public ModelAndView aboutus(Model model){
        return new ModelAndView("aboutus");
	}
	
	@RequestMapping("/repairs")
    public ModelAndView repairs(Model model){
        return new ModelAndView("repairs");
	}
	
	@RequestMapping("/blog")
    public ModelAndView blog(Model model){
        return new ModelAndView("blog");
	}
	
	@RequestMapping("/blogpost")
    public ModelAndView blogpost(Model model){
        return new ModelAndView("blogpost");
	}
	
	@RequestMapping("/gallery")
    public ModelAndView gallery(Model model){
        return new ModelAndView("gallery");
	}
	
	@RequestMapping("/typography")
    public ModelAndView typography(Model model){
        return new ModelAndView("typography");
	}
	
	@RequestMapping("/iconlists")
    public ModelAndView iconlists(Model model){
        return new ModelAndView("iconlists");
	}
	
	@RequestMapping("/progressbars")
    public ModelAndView progressbars(Model model){
        return new ModelAndView("progressbars");
	}
	
	@RequestMapping("/callstoaction")
    public ModelAndView callstoaction(Model model){
        return new ModelAndView("callstoaction");
	}
	
	@RequestMapping("/tabsandaccordions")
    public ModelAndView tabsandaccordions(Model model){
        return new ModelAndView("tabsandaccordions");
	}
	
	@RequestMapping("/buttons")
    public ModelAndView buttons(Model model){
        return new ModelAndView("buttons");
	}
	
	@RequestMapping("/tables")
    public ModelAndView tables(Model model){
        return new ModelAndView("tables");
	}
	
	@RequestMapping("/forms")
    public ModelAndView forms(Model model){
        return new ModelAndView("forms");
	}
	
	@RequestMapping("/counters")
    public ModelAndView counters(Model model){
        return new ModelAndView("counters");
	}
	
	@RequestMapping("/gridsystem")
    public ModelAndView gridsystem(Model model){
        return new ModelAndView("gridsystem");
	}
	
	@RequestMapping("/tractorparts")
    public ModelAndView tractorparts(Model model){
        return new ModelAndView("tractorparts");
	}
	
	@RequestMapping("/testimonials")
    public ModelAndView testimonials(Model model){
        return new ModelAndView("testimonials");
	}
	
	@RequestMapping("/comingsoon")
    public ModelAndView comingsoon(Model model){
        return new ModelAndView("comingsoon");
	}
	
	@RequestMapping("/privacypolicy")
    public ModelAndView privacypolicy(Model model){
        return new ModelAndView("privacypolicy");
	}
	
	@RequestMapping("/ourteam")
    public ModelAndView ourteam(Model model){
        return new ModelAndView("ourteam");
	}
	
	@RequestMapping("/searchresults")
    public ModelAndView searchresults(Model model){
        return new ModelAndView("searchresults");
	}
	
	@RequestMapping("/contactus")
    public ModelAndView contactus(Model model){
        return new ModelAndView("contactus");
	}
   	 
}
