package appliweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
		@GetMapping("/alive")
		public @ResponseBody String alive() {
			System.out.println("Je suis en vie");
			return "blabla";
		}
	
}
