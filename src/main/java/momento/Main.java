package momento;

public class Main {
    public static void main(String[] args){
        var caretaker = new Caretaker();
        var editor =  new Editor(caretaker);
        var editorState =  new EditorState();

        editor.createState(editorState, "Ashik");
        System.out.println("Present content is "+editorState.getContent());

        editor.createState(editorState, "Muhammad");
        System.out.println("Present content is "+editorState.getContent());

        editor.createState(editorState, "Shakil");
        System.out.println("Present content is "+editorState.getContent());

        caretaker.getStates().stream().forEach(state ->{
            System.out.println(state.getContent());
        });

        System.out.println("the popping content is "+editor.removeState(editorState));

        System.out.println("present content is "+editorState.getContent());


    }
}
