package in.coreDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.coreDemo")  // it says spring to scan all the compnents in the package of in.coredemo and there sub package
// if we don't write the package name the @Component scan only sxans the packag ehere AppConfig files is located

public class AppConfig {
    //empty


    }

