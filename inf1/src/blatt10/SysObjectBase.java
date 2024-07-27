package blatt10;

public class SysObjectBase {

    protected String name = "";
    protected String owner = "";

    protected SysObjectBase(String name) {
        this.name = name;
        this.owner = System.getenv("USERNAME");
    }

    @Override
    public String toString() {
        String className = "SysObjectBase";
        String name = this.name;
        String owner = this.owner;

        return "Class=" + className + " Name=" + name + " User=" + owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
