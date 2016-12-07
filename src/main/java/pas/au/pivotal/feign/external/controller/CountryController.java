package pas.au.pivotal.feign.external.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CountryController
{
    Logger logger = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home()
    {
        return "main";
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo()
    {
        return "demo";
    }
}
