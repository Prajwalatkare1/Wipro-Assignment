package com.example.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Accounts_Questions1 account = (Accounts_Questions1) context.getBean("accountBean");
        account.printDetails();
    }
}

//}
//
//public  getBankId() {
//  return bankId;
//}
//
//public String getBankName() {
//  return bankName;
//}
//}
//
//