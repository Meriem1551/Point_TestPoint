package point;

public class Point{
    private float x, y;

    public Point(float x, float y)
    {
        this.x = x;
        this.y =y;
    }
    public void addNumber(float dx, float dy)
    {
        this.x = this.x+dx;
        this.y=this.y+dy;
    }
    public float getX()
    {
        return x;
    }
    public float getY()
    {
        return y;
    }
    public void setX(float x)
    {
        this.x = x;
    }
    public void setY(float y)
    {
        this.y = y;
    }
}