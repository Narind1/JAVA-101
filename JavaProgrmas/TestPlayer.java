package JavaProgrmas;
//4.	Write a Java program to create an interface Playable with methods play(), pause(), and stop(). 
//Implement this interface in a class MusicPlayer that overrides these methods to print appropriate messages (e.g., "Music is playing," "Music is paused," "Music is stopped").
// Create another class TestPlayer with a main() method to test the functionality by calling the play(), pause(), and stop() methods. 
interface Playable {
    void play();
    void pause();
    void stop();
}
class MusicPlayer implements Playable{
    public void play(){
        System.out.println("Music is playing");
    }
    public void pause(){
        System.out.println("Music is paused");
    }
    public void stop(){
        System.out.println("Music is stopped");
    }
}
class TestPlayer{
    public static void main(String[] args){
        MusicPlayer mp = new MusicPlayer();
        mp.play();
        mp.pause();
        mp.stop();
    }
}