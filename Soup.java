//Madelyn Wang 
//Modifies the string letters based on input from the user.
//pre condition: letters string
//post condition: letters strings modifies based on user input
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


       //precondition: letters string
    //postcondition: letters string with word added
    public void add(String word){
         letters = letters + word;
          
    }




 //precondition: letters string
    //postcondition: random character from letters string
    public char randomLetter(){
      
       int rand = (int) (Math.random () *letters.length()) ;
       
       char a = letters.charAt(rand);
       
        return a;
    }




    //precondition: letters string
    //postcondition: letters string with company in the middle
    public String companyCentered(){
    
        letters = letters.substring(0, (int)letters.length()/2) + company + letters.substring((int)letters.length()/2, letters.length());
        return letters;
        

    }




    //precondition: letters string
    //postcondition: letters string without vowels
    public void removeFirstVowel(){
//bingus 
//https://static.wikia.nocookie.net/duckpond/images/7/79/Bongos.png/revision/latest/thumbnail/width/360/height/450?cb=20210112004529
       letters = letters.replaceFirst("[aeiouAEIOU]","");
          
    }
 
//precondition: letters string
    //postcondition: letters string without random amount of numbers
    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
 System.out.println(num);
 int randomVal =(int) (Math.random()*letters.length());
 
 letters = letters.substring(0,randomVal)+letters.substring(randomVal+num,letters.length());
 
 
    }


       //precondition: letters string
    //postcondition: letters string without "word"
    public void removeWord(String word){
       
        int wordLoc = letters.indexOf("word");
        if(wordLoc>-1){
            if(wordLoc+5<letters.length()){
        letters = letters.substring(0,wordLoc) +letters.substring(wordLoc+1,letters.length());
        } else 
            letters = letters.substring(0,wordLoc) +letters.substring(wordLoc+1);
        }
    }
    
    }