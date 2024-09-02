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

        // DE with setter and from file
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.printf("%d\n", musicPlayer.getVolume());
    }
} 