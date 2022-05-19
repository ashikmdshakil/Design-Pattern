package momento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<EditorState> states =  new ArrayList<>();

    public List<EditorState> getStates() {
        return states;
    }

    public void setStates(List<EditorState> states) {
        this.states = states;
    }

    public void push(EditorState editorState){
        states.add(editorState);
    }

    public String pop(EditorState editorState){
        String lastContent = states.get(states.size() -1).getContent();
        states.remove(states.size() - 1);
        int number = states.size();
        editorState.setContent(states.get(number - 1).getContent());
        return lastContent;
    }
}
