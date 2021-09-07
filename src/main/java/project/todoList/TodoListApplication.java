package project.todoList;

import configuration.CXFConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Import({CXFConfig.class})
@MapperScan({"todolist"})
public class TodoListApplication extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(TodoListApplication.class);



    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(TodoListApplication.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
        logger.info("Application has started");
    }
}