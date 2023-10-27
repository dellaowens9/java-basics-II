package Inheritance;

public class Villians {
    
    String name; 
    String speak; 

    public Villians(){
        this.speak = "I am a villian"; 
    };

    public Villians(String name, String speak){
        this.name = name;
        this.speak = "I am a villian"; 
    }

    public String getSpeak(){
        return speak;
    }
}
