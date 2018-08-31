package co.grandcircus.famouslab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.Complete;
import co.grandcircus.famouslab.model.Tiny;


@Controller
public class FamousController {

	@RequestMapping("/")
	public ModelAndView famousTiny() {
		ModelAndView mav = new ModelAndView("tiny");
		//create rest template
		RestTemplate restTemplate = new RestTemplate();
		//set headers if any
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		//set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		//specify method and call exchange
		restTemplate.exchange( url, HttpMethod.GET,
				new HttpEntity<>(headers), Tiny.class);
		ResponseEntity<Tiny> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(headers), Tiny.class);
		//get body and return added item to jsp
		Tiny tiny = response.getBody();
		
		mav.addObject("tiny", tiny.getTiny());
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView famousCOmplete() {
		ModelAndView mav = new ModelAndView("complete");
		//create rest template
		RestTemplate restTemplate = new RestTemplate();
		//set headers if any
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");
		//set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
		//specify method and call exchange
		restTemplate.exchange( url, HttpMethod.GET,
				new HttpEntity<>(headers), Complete.class);
		ResponseEntity<Complete> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<>(headers), Complete.class);
		//get body and return added item to jsp
		Complete complete = response.getBody();
		
		mav.addObject("complete", complete.getComplete());
		return mav;
	}
}
