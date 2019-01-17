package rxjava;

public class SubClass {


    private String text;

    public SubClass(String text){
        this.text =text;
    }

    public void fuck(Handler handler){
        handler.handle(this.text);
    }


}
