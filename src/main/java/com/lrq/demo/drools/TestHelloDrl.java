package com.lrq.demo.drools;

import com.lrq.demo.drools.entity.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

public class TestHelloDrl {
    public static void main(String[] args) {
//        KieService是一个中心，通过他获取的各种对象来完成规则构建、管理和执行等操作
        KieServices services = KieServices.Factory.get();
        KieContainer container = services.getKieClasspathContainer();
        KieSession session = container.newKieSession("hello_session");


        Person person = new Person("张三",40);
        FactHandle insert = session.insert(person);

        int count = session.fireAllRules();
        System.out.println("总共执行了"+count+"条规则");
        System.out.println(person.getName());
        /** 清理KieSession维护的状态 */
        session.dispose();

    }
}
