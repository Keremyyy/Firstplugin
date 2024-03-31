package LuunkieKaasheer;

public class LuunkieMode {
    // plugin die luuk allemaal powers geeft
    // dit gebeurt als luunkie op een een specifieke toets op zijn toetsenbordt drukt

    private boolean isLuunkieMode = false;

    public void setLuunkieMode() {
        isLuunkieMode =! isLuunkieMode;
    }
}
