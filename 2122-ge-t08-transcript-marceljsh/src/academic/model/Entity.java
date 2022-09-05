package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public abstract class Entity {
    protected String code;
    protected String name;

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("%s|%s", code, name);
    }
}
