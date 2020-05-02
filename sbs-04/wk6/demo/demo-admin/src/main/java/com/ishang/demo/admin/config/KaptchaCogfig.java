package com.ishang.demo.admin.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
 

/**
 * 验证码配置
 * 
 *
 * create by zhayao 2020年3月30日
 */
public class KaptchaCogfig {
	
	@Bean
    public DefaultKaptcha producer() {
        Properties properties = new Properties();
        properties.put("kaptcha.border", "no");
        properties.put("kaptcha.textproducer.font.color", "black");
        properties.put("kaptcha.textproducer.char.space", "5");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

}
