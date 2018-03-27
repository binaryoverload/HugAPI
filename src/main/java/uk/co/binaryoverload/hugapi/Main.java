package uk.co.binaryoverload.hugapi;

public class Main {

    public static void main(String[] args) {
	    Hug.createHug()
                .hugger("Walshy")
                .huggee("William")
                .type(Hug.HugType.FRIENDLY)
                .length(Hug.HugLenth.JUST_RIGHT)
                .emotion(Hug.Emotion.HAPPY)
                .hug();
    }
}
