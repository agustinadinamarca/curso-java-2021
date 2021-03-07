package javacourse;

public class FiguraPlanaV2 {
	private static final float LIMIT = (float) 124.5;
	
	private float edge;
	private String type;
	
	public FiguraPlanaV2(float edge, String type) {
		this.edge = edge;
		this.type = type;
	}
	
	public float calculate_area() {
		if (this.type == "R") {
			float area = this.edge * this.edge;
			if (area > LIMIT) {
				System.out.print("Se ha superado el valor límite permitido de área para las características del rectángulo ingresado.\n");
			}
			return area;

		} else if (this.type == "T") {
			return (float) this.edge * this.edge / 2;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		float edge = (float) 20.4;
		String type = "R";
		FiguraPlanaV2 object1 = new FiguraPlanaV2(edge, type);
		System.out.print("Result (rectangle " + edge + " m height and width): " + object1.calculate_area() + " m^2.\n");
		
		edge = (float) 3.8;
		type = "T";
		FiguraPlanaV2 object2 = new FiguraPlanaV2(edge, type);
		System.out.print("Result (triangle " + edge + " m height and width): " + object2.calculate_area() + " m^2.\n");
	}
	
}
