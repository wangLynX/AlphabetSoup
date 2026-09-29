//Madelyn Wang 

public class Soup {
    //these are instance variables
    private String letters;
    private String company;


    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }




    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }


    //returns the company name
    public String getCompany(){
        return company;
    }


    //returns letters
    public String getLetters(){
        return letters;
    }


//below are the functions you'll be writing.


    //adds a word to the pool of letters known as "letters"
    public void add(String word){
         letters = letters + word;
    }




    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
      
       int rand = (int) (Math.random () *letters.length()) ;
       
       char a = letters.charAt(rand);
       
        return a;
    }




    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
    
        letters = letters.substring(0, (int)letters.length()/2) + company + letters.substring((int)letters.length()/2, letters.length());
        return letters;
        

    }




    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
 


       letters = letters.replaceFirst("[aeiouAEIOU]","");
    }


    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
 System.out.println(num);
 int randomVal =(int) (Math.random()*num);
 if(randomVal<letters.length()){
 letters = letters.substring(0,randomVal)+letters.substring(randomVal+1,letters.length());
 }

    }


    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
       letters = "bdawiudhuiwordsdfgsf";
        int wordLoc = letters.indexOf("word");
        if(wordLoc>-1){
            if(wordLoc+5<letters.length()){
        letters = letters.substring(0,wordLoc) +letters.substring(wordLoc+5,letters.length());
        } else 
            letters = letters.substring(0,wordLoc) +letters.substring(wordLoc+5);
        }
    }
    }