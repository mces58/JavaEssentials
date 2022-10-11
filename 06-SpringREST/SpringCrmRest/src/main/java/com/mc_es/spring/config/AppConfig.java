package com.mc_es.spring.config;

import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.mc_es.spring")
@PropertySource(value = { "classpath:persistence-sqlServer.properties" })
public class AppConfig implements WebMvcConfigurer {

	@Autowired
	private Environment environment;
	private Logger logger = Logger.getLogger(getClass().getName());

	@Bean
	public DataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();

		try {
			dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}

		logger.info("jdbc.url=" + environment.getProperty("jdbc.url"));
		logger.info("jdbc.user=" + environment.getProperty("jdbc.user"));

		dataSource.setJdbcUrl(environment.getProperty("jdbc.url"));
		dataSource.setUser(environment.getProperty("jdbc.user"));
		dataSource.setPassword(environment.getProperty("jdbc.password"));

		dataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
		dataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
		dataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
		dataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();

		properties.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));

		return properties;
	}

	private int getIntProperty(String propName) {
		String propValue = environment.getProperty(propName);

		int intPropValue = Integer.parseInt(propValue);

		return intPropValue;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(environment.getProperty("hibernate.packagesToScan"));
		sessionFactory.setHibernateProperties(getHibernateProperties());

		return sessionFactory;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}
}
