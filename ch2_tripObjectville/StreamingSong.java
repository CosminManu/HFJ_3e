public class StreamingSong {
String title;
String artist;
int durationl;

void play(){
System.out.println("Playing song");
}

void printDetails(){
System.out.println("This is \""+title + "\" by "+artist);
}
}

class StreamingSongTest {
public static void main(String[] args){
	StreamingSong song = new StreamingSong();
	song.artist = "The Beatles";
	song.title = "Come Together";
	song.play();
	song.printDetails();
}
}

