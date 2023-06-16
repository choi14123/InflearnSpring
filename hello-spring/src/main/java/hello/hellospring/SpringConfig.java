package hello.hellospring;


import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.apache.logging.log4j.util.PerformanceSensitive;
import org.hibernate.annotations.Comment;
import org.hibernate.boot.model.naming.EntityNaming;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private EntityManager em;


    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    public TimeTraceAop timeTraceAop(){
        return timeTraceAop();
    }
    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        //return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
