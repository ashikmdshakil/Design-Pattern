package momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState editorState){
        this.states.add(editorState);
    }

    public EditorState pop(){
        this.states.remove(this.states.size() - 1);
        var editorState = this.states.get(this.states.size() - 1);
        return editorState;
    }
}
