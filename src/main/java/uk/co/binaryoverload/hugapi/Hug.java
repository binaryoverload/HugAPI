package uk.co.binaryoverload.hugapi;

public class Hug {

    private HugType type;
    private HugLenth length;

    private String huggee;
    private Emotion emotion;

    private String hugger;

    private Hug(HugType type, HugLenth length, String huggee, String hugger, Emotion emotion) {
        this.type = type;
        this.length = length;
        this.huggee = huggee;
        this.hugger = hugger;
        this.emotion = emotion;
    }

    public HugType getType() {
        return type;
    }

    public HugLenth getLength() {
        return length;
    }

    public String getHuggeeName() {
        return huggee;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public String getHuggerName() {
        return hugger;
    }
    
    public static HugGenerator createHug() {
        return new HugGenerator();
    }

    public void hug() {
        if (type == HugType.AWKWARD) {
            if (length == HugLenth.JUST_RIGHT) {
                throw new InvalidHugException("Awkward hugs cannot be just right in length!");
            } else if (length == HugLenth.TOO_SHORT) {
                throw new InvalidHugException("Awkward hugs are always longer than the huggee wants!");
            } else if (emotion != Emotion.UNCOMFORTABLE || emotion != Emotion.AWKWARD) {
                throw new InvalidHugException("This is too suspicious! Awkward hugs need awkwardness go damn it!");
            }
        }

        System.out.printf("%s gave %s a %s hug! It was %s! %s now feels %s!", hugger, huggee, type, length, huggee, emotion);

    }

    public static class HugGenerator {

        private HugType type = HugType.FRIENDLY;

        private HugLenth length = HugLenth.JUST_RIGHT;

        private String huggee;
        private Emotion emotion = Emotion.EMOTIONLESS;

        private String hugger;

        public HugGenerator type(HugType type) {
            this.type = type;
            return this;
        }

        public HugGenerator length(HugLenth length) {
            this.length = length;
            return this;
        }

        public HugGenerator huggee(String name) {
            this.huggee = name;
            return this;
        }

        public HugGenerator hugger(String name) {
            this.hugger = name;
            return this;
        }

        public HugGenerator emotion(Emotion emotion) {
            this.emotion = emotion;
            return this;
        }

        public Hug hug() {
            Hug hug = new Hug(type, length, huggee, hugger, emotion);
            hug.hug();
            return hug;
        }

    }

    public enum HugType {
        PASSIONATE,
        FRIENDLY,
        CUTE,
        AWKWARD,
        MUM_HUG,
        COMFORTING,
        BRITISH,
        WHY;

        @Override
        public String toString() {
            return name().toLowerCase().replace("_", " ");
        }
    }

    public enum HugLenth {
        JUST_RIGHT,
        TOO_LONG,
        TOO_SHORT,
        UNCOMFORTABLY_LONG;

        @Override
        public String toString() {
            return name().toLowerCase().replace("_", " ");
        }
    }

    public enum Emotion {
        SAD,
        HAPPY,
        UPSET,
        UNMOTIVATED,
        UNCOMFORTABLE,
        EMOTIONLESS,
        EXCITED,
        AWKWARD;

        @Override
        public String toString() {
            return name().toLowerCase().replace("_", " ");
        }
    }


}
