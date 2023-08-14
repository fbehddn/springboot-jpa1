package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpashopApplication.class, args);
	}

	@Bean
	Hibernate5Module hibernate5Module() {
//		hibernate5Module().configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);
		/**
		 * 기본 설정
		 * lazy 로딩을 호출해서 정상적으로 프록시가 초기화 된 애들만 API로 반환이 된다
		 */
		return new Hibernate5Module();
	}

}
