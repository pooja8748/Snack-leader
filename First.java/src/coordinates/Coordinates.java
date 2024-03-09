package coordinates;

public class Coordinates {
    int row;
    int col;

    public Coordinates(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String printCoordinates() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(this.row).append(",").append(this.col).append("]");
        return sb.toString();
    }

    public boolean getRow() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRow'");
    }
}