// Declare an enum named Color
package enumEx;

enum Color2 {
    // Define four constants for different colors
    // Each constant has two attributes: name and code
    RED("Red", "#FF0000"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    BLACK("Black", "#000000");

    // Declare private variables to store the attributes
    private String name;
    private String code;

    // Define a constructor that takes two arguments
    private Color2(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Define getters for the attributes
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}