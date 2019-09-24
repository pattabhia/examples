package flyweight;

import java.util.HashMap;

import com.sun.corba.se.spi.activation._InitialNameServiceImplBase;

public class MathFactory {

	private static volatile MathFactory _INSTANCE;

	private static HashMap<String, IMath> map;

	private MathFactory() {
		map = new HashMap<String, IMath>();
	}

	public static MathFactory getInstance() {
		if (_INSTANCE == null) {
			_INSTANCE = new MathFactory();
		}
		return _INSTANCE;
	}

	public IMath getMathInstance(String key) {

		IMath math = null;
		if (map != null && !map.isEmpty() && map.containsKey(key)) {
			return map.get(key);
		} else {
			if ("add".equals(key)) {
				map.put(key, new OperationAdd());
			} else if ("multi".equals(key)) {
				map.put(key, new OperationMultiply());
			}
		}
		return map.get(key);
	}
}
