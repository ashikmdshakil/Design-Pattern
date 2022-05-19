package momento;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String content;
    private Caretaker caretaker;

    public Editor(){
    }

    public Editor(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void createState(EditorState editorState, String content){
        editorState.setContent(content);
        this.caretaker.push(new EditorState(editorState.getContent()));
    }

    public String removeState(EditorState editorState){
        return caretaker.pop(editorState);
    }

/*    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }*/
}
