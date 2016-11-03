package model;

public class Circle implements CircleChecker{
	
	private CircleChecker checker;
	/**
	 * @Title: isInCircle
	 * @Description: TODO judge if a node in a Circle
	 * @param cx Center of a circle x
	 * @param cy Center of a circle y
	 * @param nx node x
	 * @param ny node y
	 * @param r  radius
	 * @return
	 */
	@Override
	public int isInCircle(double cx, double cy, double nx, double ny, double r) {
		if (r <= 0) {
			return -1;
		}
		double gapX = (cx - nx) * (cx - nx);
		double gapY = (cy - ny) * (cy - ny);
		double distance = Math.sqrt(gapX + gapY);
		
		if (distance == r) {
			return 0;     // on
		}else if (distance < r) {
			return 1;    // in
		}else{
			return 2;   // out
		}
		
	}
	
	/**
	 * @Title: tangent
	 * @Description: TODO calculate the length of circle
	 * @param cx
	 * @param cy
	 * @param nx
	 * @param ny
	 * @param r
	 * @return
	 */
	public double tangent (double cx, double cy, double nx, double ny, double r){
		int result = checker.isInCircle(cx, cy, nx, ny, r);
		double tangent = 0d;
		switch (result) {
		case 2:
			double gapX = (cx - nx) * (cx - nx);
			double gapY = (cy - ny) * (cy - ny);
			tangent = Math.sqrt(gapX + gapY - r * r) ;
			break;
		case 0:
			tangent = 0;
			break;
		default:
			tangent = -1;
			break;
		}
		return tangent;
	}

	public CircleChecker getChecker() {
		return checker;
	}

	public void setChecker(CircleChecker checker) {
		this.checker = checker;
	}


}
