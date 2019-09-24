/**
 * 
 */
package flyweight;

/**
 * @author amperayp
 *
 */
public class OperationAdd implements IMath {

	public OperationAdd() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see flyweight.IMath#doMath(int, int)
	 */
	public Integer doMath(int value1, int value2) {

		return (value1 + value2);
	}

}
