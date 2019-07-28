package kr.co.mlec.db.test;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("kr.co.mlec.db.board")
@PropertySource("classpath:config/db/mybatis/db.properties")
@MapperScan(basePackages= {"kr.co.mlec.db.repository.mapper"})
@EnableTransactionManagement
public class Config {
	
	@Autowired
	private ApplicationContext context;
	
	@Value("${jdbc.oracle.driver}")
	private String driverClassName;
	@Value("${jdbc.oracle.url}")
	private String url;
	@Value("${jdbc.oracle.username}")
	private String username;
	@Value("${jdbc.oracle.password}")
	private String password;
	
	@Bean(value="dataSource", destroyMethod="close")
	public BasicDataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		/*
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		*/
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
	}
	
	// Mapper 에서 등록된 빈의 타입중에서 자동으로 SqlSessionFactory, sqlSessionTemplate을 찾는다.
	// 만약, 없다면 다음의 이름을 가진 빈 객체를 찾는다.
	// Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
	@Bean("SqlSessionFactory")
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
//		System.out.println("context : " + context);
		
		SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setTypeAliasesPackage("kr.co.mlec.db.repository.vo");
		// 예외 발생 메서드임... : 매개변수  Resource[] 배열 필요...
		factory.setMapperLocations(context.getResources("classpath:config/db/sqlmap/*.xml"));
		// 매개변수  Resource 필요
		factory.setConfigLocation(context.getResource("classpath:config/db/mybatis/sqlMapConfig.xml"));
		
		return factory.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(getDataSource());
		return transactionManager;
	}
}

