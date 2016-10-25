package Test1;

public class Triangle {

	// three edges
	private double a;
	private double b;
	private double c;

	public Triangle() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

	public Triangle(double a, double b, double c) throws Exception {
		if (!isTriangle(a, b, c)) {
			throw new Exception("These three numbers can not form a triangle!");
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @Title: isTriangle
	 * @Description: TODO judge if is a Triangle
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean isTriangle(double a, double b, double c) {
		if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
			return true;
		}
		return false;
	}

	/**
	 * @Title: getArea
	 * @Description: TODO calculate area
	 * @param a edge1
	 * @param b edge2
	 * @param c edge3
	 * @return double area
	 */
	public double getArea(double a, double b, double c) {
		if (!isTriangle(a, b, c)) {
			return -1d; // can construct a triangle
		}

		double p = 0;
		double area = 0;
		p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
