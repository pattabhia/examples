package flyweight;

public class OperationMultiply implements IMath {

	public OperationMultiply() {
	}

	public Integer doMath(int value1, int value2) {
		return (value1 * value2);
	}

}
