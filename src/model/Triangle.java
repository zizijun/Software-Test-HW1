package model;

public class Triangle implements TriangleChecker{

	// three edges
	
	private TriangleChecker checker;

	/**
	 * @Title: isTriangle
	 * @Description: TODO judge if is a Triangle
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	@Override
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
		if (!checker.isTriangle(a, b, c)) {
			return -1d; // cannot construct a triangle
		}

		double p = 0;
		double area = 0;
		p = (a + b + c) / 2.0;
		area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return area;
	}


	public TriangleChecker getChecker() {
		return checker;
	}

	public void setChecker(TriangleChecker checker) {
		this.checker = checker;
	}
	

}
