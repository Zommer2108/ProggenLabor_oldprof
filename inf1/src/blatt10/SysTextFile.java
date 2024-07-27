package blatt10;

public class SysTextFile extends SysObjectBase{

    private String type = "";
    private String text = "";

    public SysTextFile(String name, String type) {
        super(name);
        this.type = type;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString(){
        String className = "SysTextFile";
        String name = this.name;
        String owner = this.owner;
        String type = this.type;
        String length = Integer.toString(this.text.length());

        return "Class=" + className + " Name=" + name + " User=" + owner + " Type=" + type + " Text=" + length;
    }
}
