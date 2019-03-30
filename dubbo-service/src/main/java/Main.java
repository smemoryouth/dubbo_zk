import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.io.IOException;

/**
 * 描述:
 *
 * @Author shilei
 * @Date 2019/2/19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 启动spring容器
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        System.out.println(">>>>>>>远程服务已经开启成功，等待服务消费...");
        System.in.read();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
