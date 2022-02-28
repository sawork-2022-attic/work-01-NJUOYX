package asciiPanel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AsciiPanel panel = context.getBean("panel", AsciiPanel.class);
        System.out.println(
                String.format(
                        "get panel: [%s], height:[%d], width:[%d]",
                        panel.getAsciiFont().getFontFilename(),
                        panel.getHeight(),
                        panel.getWidth())
        );
    }
}
