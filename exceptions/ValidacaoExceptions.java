package exceptions;

public class ValidacaoExceptions {

	public static boolean checkExceptions() {
		//Exceptions não podem ficar sem seus tratamentos
		//RuntimeExceptions tem tratamento opcional
		try {
			test1();
			test2();
		} catch (CustomException  | CustomException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally chamado");
		}
		test3();
		return true;
	}
	
	private static void test1() throws CustomException {
		throw new CustomException();
	}
	
	private static void test2() throws CustomException2 {
		throw new CustomException2();
	}
	
	private static void test3() {
		throw new CustomRuntimeException();
	}
}
