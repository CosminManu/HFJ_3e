public class Episode {
int seriesNumber;
int episodeNumber;

void skipIntro() {
System.out.println("Skipping..");
}

void skipToNext() {
System.out.println("Loading next song..");
}
}

class MainEpisode {
public static void main(String... a){
Episode e = new Episode();
e.seriesNumber =1;
e.skipIntro();
e.skipToNext();
}
//it compiles and runs; no need to fill all instance variables in this example

}