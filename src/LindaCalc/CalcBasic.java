package LindaCalc;

public class CalcBasic implements ICalcBasic {

	@Override
	public double add(double first, double second) {
		double sum = first + second;
		return sum;
	}

	@Override
	public double sub(double first, double second) {
		double sum = first - second;
		return sum;
	}

	@Override
	public double mult(double first, double second) {
		double sum = first*second;
		return sum;
	}

	@Override
	public double div(double first, double second) {
		double sum = first/second;
		return sum;
	}

	@Override
	public double proc(double first, double second) {
		double sum = first%second;
		return sum;
	}

}
