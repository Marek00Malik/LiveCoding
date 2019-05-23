package pl.code.house.recruiting.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Spring_Beans {

    public static void main(String...args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(Spring_Beans.class);


        Object bean1 = cxt.getBean("bean1");
        Object bean2 = cxt.getBean("bean2");


        System.out.println("bean1 == bean2 : " + bean1 == bean2);
        System.out.println("bean1.equals(bean2) : " + bean1.equals(bean2));
    }

    @Bean("bean1")
    ObjectBean bean1() {
        return new ObjectBean("val");
    }

    @Bean("bean2")
    ObjectBean bean2() {
        return new ObjectBean("val");
    }

    private class ObjectBean {
        private String value;

        private ObjectBean(String value) {
            this.value = value;
        }
    }
}
