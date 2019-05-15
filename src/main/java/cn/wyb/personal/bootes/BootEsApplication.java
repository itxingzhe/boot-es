package cn.wyb.personal.bootes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wyb.personal.bootes.mapper")
public class BootEsApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootEsApplication.class, args);
  }

}
