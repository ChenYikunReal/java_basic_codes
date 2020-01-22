package Imitation_Code;

import java.util.logging.*;

public class LoggerTest {
	public static void main(String[] args) throws Exception {
		//��ȡSystem,Logger����
		System.Logger logger = System.getLogger("fkjava");
		//������־����
		Logger.getLogger("fkjava").setLevel(Level.FINE);
		//����ʹ��a.xml������־��¼
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		logger.log(System.Logger.Level.DEBUG, "debug��Ϣ");
		logger.log(System.Logger.Level.INFO, "info��Ϣ");
		logger.log(System.Logger.Level.ERROR, "error��Ϣ");
	}

}
