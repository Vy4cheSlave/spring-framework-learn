package authorization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{ 
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        // IoC
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // DE with XML-conf
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        musicPlayer.playMusic();
    }
} 