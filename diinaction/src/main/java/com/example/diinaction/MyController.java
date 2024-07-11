package com.example.diinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    /*
     * traditional way of creating the instances of the classes
     * PrototypeBean prototypeBean = new PrototypeBean();
     * SingletonBean singletonBean = new SingletonBean();
     */

    /*
     * Spring framework creates such instances for us and the same can be acheived
     * using @Autowired annotation
     */

    /* injecting an instance (bean) of the class PrototypeBean */
    @Autowired
    private ProtoTypeBean protoTypeBean;

    /* injecting an instance (bean) of the class PrototypeBean */
    @Autowired
    private ProtoTypeBean protoTypeBean2;

    /* injecting an instance (bean) of the class SingletonBean */
    @Autowired
    private SingletonBean singletonBean;

    /* injecting an instance (bean) of the class SingletonBean */
    @Autowired
    private SingletonBean singletonBean2;

    @RequestMapping("/singletest")
    public void testSingleton() {
        /* calling the increment of the counter on the first instance */
        singletonBean.setCounter();
        singletonBean2.setCounter();
        singletonBean2.setCounter();
        int s1, s2;
        s1 = singletonBean.getCounter();
        s2 = singletonBean2.getCounter();
        // print the values of counter on both the instances
        System.out.println("The value of the counter in the first instance is: " + s1);
        System.out.println("The value of the counter in the second instance is: " + s2);

        /* printing the hashcode of the objects (beans) */
        System.out.println("hashcode of singletonBean is: " + singletonBean.hashCode());
        System.out.println("hashcode of singletonBean2 is: " + singletonBean2.hashCode());
    }

    @RequestMapping("/prototest")
    public void testProto() {
        /* Calling the increment of the counter on the first instance */
        protoTypeBean.setCounter();
        protoTypeBean2.setCounter();
        protoTypeBean2.setCounter();
        int p1, p2;
        p1 = protoTypeBean.getCounter();
        p2 = protoTypeBean2.getCounter();
        // print the values of counter on both the instances
        System.out.println("The value of the counter in the first instance is: " + p1);
        System.out.println("The value of the counter in the second instance is: " + p2);
        System.out.println("hashcode of protoTypeBean is: " + protoTypeBean.hashCode());
        System.out.println("hashcode of protoTypeBean2 is: " + protoTypeBean2.hashCode());

    }
}
