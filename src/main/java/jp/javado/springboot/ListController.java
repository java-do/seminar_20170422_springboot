package jp.javado.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ueno on 2017/04/17.
 */
@Controller
public class ListController {

    @RequestMapping("/web/list")
    public ModelAndView list(ModelAndView modelAndView) {
        modelAndView.setViewName("list");
        modelAndView.addObject("message1", "Controllerで設定した文字列");
        return modelAndView;
    }
}
