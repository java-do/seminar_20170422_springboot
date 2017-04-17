package jp.javado.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ueno on 2017/04/17.
 */
@Controller
public class IndexController {

    @Autowired
    private ISampleService sampleService;

    @RequestMapping("/web/index")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("message1", "Controllerで設定した文字列");
        modelAndView.addObject("dimessage", sampleService.getSample("2"));
        //modelAndView.addObject("dimessage", "2");
        return modelAndView;
    }
}
