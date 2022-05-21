package momento;

public class Main {
    public static void main(String[] args){
        var editor =  new Editor();
        var history =  new History();

        editor.setContent("ashik");
        history.push(editor.createContent());

        editor.setContent("Muhammad");
        history.push(editor.createContent());

        editor.setContent("shakil");
        history.push(editor.createContent());

        editor.remove(history.pop());

        System.out.println(editor.getContent());



    }
}
