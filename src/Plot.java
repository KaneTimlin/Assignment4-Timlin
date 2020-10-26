package src;

public class Plot {

    private int x;
    private int y;
    private int width;
    private int depth;

    /**
     * A simple no-args constructor for Plot
     */
    public Plot() {
        x = y = 0;
        width = depth = 1;
    }

    /**
     * Uses the given values to create a new Plot object
     * @param x the top-left x coordinate of the plot
     * @param y the top-left y coordinate of the plot
     * @param width the width of the plot
     * @param depth the depth of the plot
     */
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    /**
     * A copy constructor for Plot. Performs a deep copy
     * @param p the plot object to be copied
     */
    public Plot(Plot p) {
        this.x = p.getX();
        this.y = p.getY();
        this.width = p.getWidth();
        this.depth = p.getDepth();
    }

    /**
     * Determines if the two plots being submitted overlap.
     * @param plot the plot to be compared
     * @return whether the two plots overlap
     */
    public boolean overlaps(Plot plot) {
        // First check if the plot encompasses this one
        if (this.encompasses(plot)) {
            return true;
        }
        // check the x coords are inside each other
        if ((this.x > plot.x) && (this.x < (plot.x + plot.width))
        || ((this.x + this.width) > plot.x && (this.x + this.width) < (plot.x + plot.width))) {
            // if not outside on y, return true
            if (!((this.y + this.depth) <= plot.y || this.y >= (plot.y + plot.depth)))
                return true;
        // do the same for y as for x, except replace x with y and width with depth.
        } else if (this.y > plot.y && this.y < (plot.y + plot.depth)
            ||   ((this.y + this.depth) > plot.y && (this.y + this.depth) < (plot.y + plot.depth))) {
            if (!(this.x <= (plot.x + plot.width) || (this.x + this.width) >= plot.x))
                return true;
        } else {
            return false;
        }
        return false;
    }

    /**
     * Determines if this plot encompasses the submitted plot
     * @param plot the plot to be checked
     * @return whether one plot encompasses the other
     */
    public boolean encompasses(Plot plot) {
        return (this.x <= plot.x && (this.x + this.width) >= (plot.x + plot.width))
            && (this.y <= plot.y && (this.y + this.depth) >= (plot.y + plot.depth));

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("Upper left: (%d,%d); Width: %d Depth: %d", x, y, width, depth);
    }
}
