
import java.util.*;
class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","What is the closest planet to sun?","What is the capital of australia?"};
    String[] options1={"Ironman","Earth","Sydney"};
    String[] options2={"Thor","Venus","Perth"};
    String[] options3={"Hulk","Mercury","Melbourne"};
    String[] options4={"Dr Strange","Jupiter","Canberra"};
    int[] answers={2,3,4};


    public void initGame()
    {    
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Correct");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("sorry!!   U r wrong.");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}

 class Player {
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;

    public void getDetails(){

        System.out.println("Enter player name");
        name=sc.next();

    }

}

 class Question {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("please choose an option");
        userAnswer=sc.nextInt();
        if(userAnswer==correctAnswer){
            return true;
        }
       return false;
    }

}
  
  
  public class Main {

    public static void main(String[] args) {
	// Quiz application
        Game game=new Game();
        game.initGame();
        game.play();

    }
}

