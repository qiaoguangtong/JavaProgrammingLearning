package answer.homework.test;
/**
 * @author Master_Joe
 *
 */
class Triangle2D1{
    private MyPoint p1,p2,p3;
 
    public Triangle2D1(){
        p1 = new MyPoint(0,0);
        p2 = new MyPoint(1,1);
        p3 = new MyPoint(2,5);
    }
 
    public Triangle2D1(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    //面积公式 s = （边1 + 边2 + 边3）/2
    //面积 = sqrt（s（s - 边1）*（s - 边2）*（s - 边3））
    public double getArea(){
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p2.distance(p3);
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
 
    public double getPerimeter(){
        return (p1.distance(p2) + p1.distance(p3) +p2.distance(p3));
    }
 
    
    //分割三角形面积相加法如果三个三角形面积相加等于原面积，则该点在三角形边上或者内部
    public boolean contains(MyPoint p){
        double area = this.getArea();  //求出原三角形的面积
        Triangle2D1 t1 = new Triangle2D1(p, this.p2, this.p3);
        Triangle2D1 t2 = new Triangle2D1(p, this.p1, this.p3);
        Triangle2D1 t3 = new Triangle2D1(p, this.p1, this.p2);
        double t1s = t1.getArea();
        double t2s = t2.getArea();
        double t3s = t3.getArea();
        if(area == t1s + t2s + t3s) {
        	return true;
        }
        else return false;
    }
 
    public boolean contains(Triangle2D1 t){
        if(this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3()))
            return true;
        return false;
    }
    
    //思路是只要任意一条边和剩余三边有交点则两个三角形必然重叠
    //公式的话可以去查询*3.25（通过线性方程组求解）
    public boolean overlaps(Triangle2D1 t){
        //t p1p2与this三边比较
    	double p1p2_p1p2 = ((t.p1.getY()-t.p2.getY())*(this.p1.getX()-this.p2.getX())) - ((t.p1.getX()-t.p2.getX())*(this.p1.getY()-this.p2.getY()));
        double p1p2_p1p3 = ((t.p1.getY()-t.p2.getY())*(this.p1.getX()-this.p3.getX())) - ((t.p1.getX()-t.p2.getX())*(this.p1.getY()-this.p3.getY()));
    	double p1p2_p2p3 = ((t.p1.getY()-t.p2.getY())*(this.p2.getX()-this.p3.getX())) - ((t.p1.getX()-t.p2.getX())*(this.p2.getY()-this.p3.getY()));
        //t p1p3与this三边比较
    	double p1p3_p1p2 = ((t.p1.getY()-t.p3.getY())*(this.p1.getX()-this.p2.getX())) - ((t.p1.getX()-t.p3.getX())*(this.p1.getY()-this.p2.getY()));
    	double p1p3_p1p3 = ((t.p1.getY()-t.p3.getY())*(this.p1.getX()-this.p3.getX())) - ((t.p1.getX()-t.p3.getX())*(this.p1.getY()-this.p3.getY()));
    	double p1p3_p2p3 = ((t.p1.getY()-t.p3.getY())*(this.p2.getX()-this.p3.getX())) - ((t.p1.getX()-t.p3.getX())*(this.p2.getY()-this.p3.getY()));
    	//t p2p3与this三边比较
    	double p2p3_p1p2 = ((t.p2.getY()-t.p3.getY())*(this.p1.getX()-this.p2.getX())) - ((t.p2.getX()-t.p3.getX())*(this.p1.getY()-this.p2.getY()));
    	double p2p3_p1p3 = ((t.p2.getY()-t.p3.getY())*(this.p1.getX()-this.p3.getX())) - ((t.p2.getX()-t.p3.getX())*(this.p1.getY()-this.p3.getY()));
    	double p2p3_p2p3 = ((t.p2.getY()-t.p3.getY())*(this.p2.getX()-this.p3.getX())) - ((t.p2.getX()-t.p3.getX())*(this.p2.getY()-this.p3.getY()));
    	if(p1p2_p1p2 != 0 && p1p2_p1p3 != 0 && p1p2_p2p3 != 0 && p1p3_p1p2 != 0 && p1p3_p1p3 != 0 && p1p3_p2p3 != 0 
    			&& p2p3_p1p2  != 0 && p2p3_p1p3 != 0 && p2p3_p2p3 != 0 ) {
    		return true;
    	}
    	else return false;
    }
    
 
    public MyPoint getP1() {
        return p1;
    }
 
    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }
 
    public MyPoint getP2() {
        return p2;
    }
 
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }
 
    public MyPoint getP3() {
        return p3;
    }
 
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
 
}
 
class MyPoint{
    private double x,y;
 
    public MyPoint(){
        x = 0;
        y = 0;
    }
 
public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
 
    public double getX(){
        return x;
    }
 
    public double getY(){
        return y;
    }
 
    public double distance(MyPoint p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
 
    public double diatance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}
 
public class Triangle2D {
	public static void main(String[] args) {
		Triangle2D1 t1 = new Triangle2D1(new MyPoint(2.5,2.0),new MyPoint(4.2,3.0),new MyPoint(5.0,3.5));
		System.out.println("t1的面积和周长分别为： "+t1.getArea() + " " +t1.getPerimeter());
		System.out.println("点（3，3）是否在t1三角形中  ：" + t1.contains(new MyPoint(3,3)));
		Triangle2D1 t2 = new Triangle2D1(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4));
		System.out.println("三点为（2.9，2）（4，1）（1，3.4）是否在t1三角形中 ： "+t1.contains(t2));
		Triangle2D1 t3 = new Triangle2D1(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5));
		System.out.println("t3是否与t1重叠： "+t1.overlaps(t3));
	}
	
}