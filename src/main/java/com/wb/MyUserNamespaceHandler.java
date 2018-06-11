package com.wb;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyUserNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user",new MyAbstractSingleBeanDefinitionParser());
    }
}
