package cn.jhtech.shiro_demo.web.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: LinYan
 * @Date: 2018/9/30 14:02
 * @Description:用于编写页面跳转的Controller
 */
@Controller
public class Form2Controller {

    @RequestMapping("/{form}")
    public String form2Controller(@PathVariable("form") String form) {
        return form;
    }
}
