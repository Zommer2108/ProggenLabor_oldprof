package blatt10;

public class SysDirectory extends SysObjectBase {

    private SysObjectBase[] sysObjects;

    protected SysDirectory(String name, SysObjectBase... sysObjects) {
        super(name);
        this.sysObjects = sysObjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO Diese Methode
    public String dirStructure(String indent) {
        String ret = "";

        for (SysObjectBase sysObject : this.sysObjects) {
            if (sysObject instanceof SysDirectory) {
                ret += indent + ((SysDirectory) sysObject).toString() + "\n" + ((SysDirectory) sysObject).dirStructure("  " + indent);
            } else {
                ret += indent + ((SysTextFile) sysObject).toString() + "\n";
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        String className = "SysDirectory";
        String name = this.name;
        String owner = this.owner;
        String length = Integer.toString(this.sysObjects.length);

        return "Class=" + className + " Name=" + name + " User=" + owner + " NumberOfObjects=" + length;
    }
}
