package authorization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContext.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{ 
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Music music = context.getBean("musicBean", Music.class);
        System.out.println(music.getSong());
        
        // IoC
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        // bean musicPlayer is singleton
        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        
        // musicPlayer.playMusic();
        // System.out.println(musicPlayer.getName());
        // System.out.printf("%d\n", musicPlayer.getVolume());

        ((ClassPathXmlApplicationContext)context).close();
    }
} 