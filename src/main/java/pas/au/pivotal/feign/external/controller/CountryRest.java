package pas.au.pivotal.feign.external.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pas.au.pivotal.feign.external.CountryServiceClient;

import java.util.Map;

@RestController
public class CountryRest
{
    Logger logger = LoggerFactory.getLogger(CountryRest.class);
    private static final JsonParser parser = JsonParserFactory.getJsonParser();

    @Autowired
    private CountryServiceClient countryServiceClient;

    @RequestMapping(value = "/countries", method = RequestMethod.GET, produces = "application/json")
    public String allCountries()
    {
        String countries = countryServiceClient.getCountries();

        return countries;
    }

    @RequestMapping(value = "/country_names", method = RequestMethod.GET)
    public String[] countryNames ()
    {
        String countries = countryServiceClient.getCountries();

        Map<String, Object> countryMap = parser.parseMap(countries);

        String countryArray[] = new String[countryMap.size()];
        logger.info("Size of countries " + countryArray.length);

        int i = 0;
        for (Map.Entry<String, Object> entry : countryMap.entrySet()) {
            countryArray[i] = (String) entry.getValue();
            i++;
        }

        return countryArray;

    }
}
