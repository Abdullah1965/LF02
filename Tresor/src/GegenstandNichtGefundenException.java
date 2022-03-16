public class GegenstandNichtGefundenException extends Exception {
    private int Id;

    public GegenstandNichtGefundenException(int id){
        this.Id = id;
    }

    public int getId() {
        return Id;
    }
    @Override
    public String getMessage() {
        String test = "Die ID existiert nicht";
        return test;
    }
}
