package controller;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by DagoManzano
 */
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class RootController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RootController.class);

    @Transactional
    @RequestMapping(value = "/",method=GET)
    @ResponseBody
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public String default_page(){

        return "Hi Hello World";
    }
}
