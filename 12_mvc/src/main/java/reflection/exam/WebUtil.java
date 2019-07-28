package reflection.exam;

import java.lang.reflect.Method;
import java.util.Properties;

public class WebUtil {
	public static Object getParamToVO(Class<?> clz, Properties  prop)
			throws Exception {
		Object obj = clz.newInstance();
		Method[] mArr = clz.getDeclaredMethods();
		for (Method m : mArr) {
			String mName = m.getName();
			
			if (!mName.startsWith("set")) continue;
			
			mName = mName.substring("set".length());
			mName = Character.toLowerCase(mName.charAt(0)) + mName.substring(1);
			
			String pValue = prop.getProperty(mName);
			
			// set 메서드에 해당하는 파라미터가 없는 경우
			if (pValue == null) continue;
			
			String pName = m.getParameterTypes()[0].getName();
			switch (pName) {
			case "java.lang.String":
				m.invoke(obj, pValue);
				break;
			case "int":
				m.invoke(obj, Integer.parseInt(pValue));
				break;
			}
		}
		return obj;
	}
}









