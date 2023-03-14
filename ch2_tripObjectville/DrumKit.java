class DrumKit {
boolean topHat = true;
boolean snare = true;

void playSnare() {
System.out.println("bang");
}

void playTop(){
System.out.println("ding");
}
}

class MainDrumKit {
public static void main(String[] a){
DrumKit drum = new DrumKit();
if(drum.snare == true){
drum.playSnare();
}
drum.snare = false;
drum.playTop();
}
}