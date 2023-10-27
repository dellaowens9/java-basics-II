package Inheritance;
public class Main {
    
    public static void main(String []args){
        var catA = new Cat("Fluffy");
        System.out.println(catA); 

        var myTable = new Table(4); 
        myTable.getPrice(); 

        Villians villian1 = new Villians(); 
        System.out.println(villian1.getSpeak()); 

        Werewolf werewolf1 = new Werewolf();
        System.out.println(werewolf1.getSpeak());
        
    }
}
