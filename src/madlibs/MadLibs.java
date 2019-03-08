
package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String adj1;
    String adj2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();
    
    // Getters
    public String getStory() {
        return story;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAdj1() {
        return adj1;
    }
    
    public String getAdj2() {
        return adj2;
    }
    
    public String getNoun1() {
        return noun1;
    }
    
    public String getNoun2() {
        return noun2;
    }
    
    public String getNoun3() {
        return noun3;
    }
    
    public String getAdverb() {
        return adverb;
    }
    
    public String getRandomNums() {
        return randomNums;
    }
    
    // Setters
    public void setStory(String newStory) {
        this.story = newStory;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAdj1(String newAdj1) {
        this.adj1 = newAdj1;
    }
    
    public void setAdj2(String newAdj2) {
        this.adj2 = newAdj2;
    }
    
    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }
    
    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }
    
    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }
    
    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }
    
    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while(index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }
    
    // Methods
    // Print instructions to player
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in "
                + "words, we'll give you a story.");
    }
    
    // Get data from player
    public void enterName() {
        System.out.println("Give me a name: ");
        setName(scanner.nextLine());
    }
    
    public void enterNoun1() {
        System.out.println("Give me a noun: ");
        setNoun1(scanner.nextLine());
    }
    
    public void enterNoun2() {
        System.out.println("Give me another noun: ");
        setNoun2(scanner.nextLine());
    }
    
    public void enterNoun3() {
        System.out.println("Give me one more noun: ");
        setNoun3(scanner.nextLine());
    }
    
    public void enterAdj1() {
        System.out.println("Give me an adjective: ");
        setAdj1(scanner.nextLine());
    }
    
    public void enterAdj2() {
        System.out.println("Give me another adjective: ");
        setAdj2(scanner.nextLine());
    }
    
    public void enterAdverb() {
        System.out.println("Give me an adverb: ");
        setAdverb(scanner.nextLine());
    }
    
    public void makeStory() {
        String story = "Jesse and her best friend " + getName() + " went to Disney World today! "
                + "They saw a " + getNoun1() + " in a show at the Magic Kingdom "
                + "and ate a " + getAdj1() + " feast for dinner. The next day I "
                + "ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2()
                + " and then that night I gazed at the " + getRandomNums() + " " 
                + getAdj2() + " fireworks shooting from the " + getNoun3() + ".";
        setStory(story);
    }
    
    
    
    public void play() {
        enterName();
        enterNoun1();
        enterAdj1();
        enterAdj2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        makeStory();
        System.out.println(getStory());
    }
    
    // Main
    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
        
    }
    
}
