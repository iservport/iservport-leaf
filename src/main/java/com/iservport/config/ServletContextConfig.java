package com.iservport.config;

import org.helianto.config.AbstractServletContextConfig;
import org.helianto.config.SecurityWebConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuracao Java.
 * 
 * @author mauriciofernandesdecastro
 */
@Configuration
@EnableTransactionManagement
@Import({ RootContextConfig.class, SecurityWebConfig.class})
public class ServletContextConfig extends AbstractServletContextConfig {

}
