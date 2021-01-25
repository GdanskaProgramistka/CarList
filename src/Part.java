public class Part {

    String part;

    @Override
    public String toString() {
        return "Part{" +
                "part='" + part + '\'' +
                '}';
    }

    public Part(String part) {
        this.part = part;
    }
}
