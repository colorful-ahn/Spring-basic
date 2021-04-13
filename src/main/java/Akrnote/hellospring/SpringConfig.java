package Akrnote.hellospring;

import Akrnote.hellospring.aop.TimeTraceAop;
import Akrnote.hellospring.repository.*;
import Akrnote.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Access;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        //return new jdbcMemberRepository(dataSource);
//       //return new JdbcTemplateMemberRepository(dataSource);
//       // return new JpaMemberRepository(em);
//
//    }
//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }

}
