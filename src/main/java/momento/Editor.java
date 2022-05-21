package momento;

public class Editor {
    private String content;

    public EditorState createContent(){
        return new EditorState(content);
    }

    public void remove(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
