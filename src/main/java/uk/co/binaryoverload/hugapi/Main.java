package uk.co.binaryoverload.hugapi;

public class Main {

    public static void main(String[] args) {
	    String hug = Hug.createHug()
                .hugger("Walshy")
                .huggee("William")
                .type(Hug.HugType.FRIENDLY)
                .length(Hug.HugLength.JUST_RIGHT)
                .emotion(Hug.Emotion.HAPPY)
                .create()
                .hug();
	    System.out.println(hug);
    }
}
