package Jumper;

import coordinates.Coordinates;
import coordinates.*;

public class jumper {
    Coordinates start;
    Coordinates end;
    String name;

    /**
     * @param start
     * @param end
     */
    public jumper(Coordinates start, Coordinates end) {
        this.start = start;
        this.end = end;

        if (start.getRow() > end.getRow()) {
            this.name = "Ladder";
        } else {
            this.name = "Snake";
        }
    }

    public String getJumperDetail() {
        return this.name;
    }
}
