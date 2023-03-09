import java.util.Random;

public class PhraseOMatic {
  public static void main(String[] args){
	String[] listOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible", "reactive", "AI enabled"};
	
	String[] listTwo = {"loosely coupled", "six sigma", "IoT", "cloud native", "event driven"};

	String[] listThree = {"framework", "library", "pipeline", "design", "orientation"};

	int oneLength = listOne.length;
	int twoLength = listTwo.length;
	int threeLength = listThree.length;

	Random random = new Random();
	int rand1 = random .nextInt(oneLength);		//return a random number between [0, listOne.length)
	int rand2 = random .nextInt(twoLength);
	int rand3 = random .nextInt(threeLength);

	String phrase = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];

	System.out.println("What we need is a " + phrase);

  }

}