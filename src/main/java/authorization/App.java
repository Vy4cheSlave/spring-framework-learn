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

        // bean musicPlayer is singleton
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerSingleton", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerSingleton", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.printf("%s , %s\n", firstMusicPlayer, secondMusicPlayer);

        // bean musicPlayer is prototype
        firstMusicPlayer = context.getBean("musicPlayerPrototype", MusicPlayer.class);
        secondMusicPlayer = context.getBean("musicPlayerPrototype", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.printf("%s , %s\n", firstMusicPlayer, secondMusicPlayer);
        
        // musicPlayer.playMusic();
        // System.out.println(musicPlayer.getName());
        // System.out.printf("%d\n", musicPlayer.getVolume());
    }
} 