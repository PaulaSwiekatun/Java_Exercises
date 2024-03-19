// Getter i Setter exercise

public class ReadOnly {

    private String name = "Paula";

  /*  public String getName() { // tylko do odczytu. //read-only

        return name;
    }

    public void setName(String name) { // we allow configurations of this field, but cannot download it and act on it.

        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
