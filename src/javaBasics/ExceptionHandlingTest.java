package javaBasics;

public class ExceptionHandlingTest {

	public void sum() throws InterruptedException, ArrayIndexOutOfBoundsException {
		Thread.sleep(1000);

		int i[] = new int[6];
		System.out.println(i[7]);

		System.out.println("After exception");
	}

	public void customisedException() {
		throw new ArrayIndexOutOfBoundsException("Customised message");
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InterruptedException {

		// Handling
		// 1. throws
//		 2. try catch

//		try {
//			int i[] = new int[6];
//			System.out.println(i[7]);
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//
//		System.out.println("Hello World");

		try {
			int i[] = new int[6];
			System.out.println(i[7]);

			String str = null;
			System.out.println("null pointer exception : " + str.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
//		  catch (NullPointerException err) { System.out.println(err.getMessage()); // }
		catch (Exception error) { // System.out.println(error.getMessage()); }

			try {
				String str = null;
				System.out.println("null pointer exception : " + str.length());
			} catch (NullPointerException e) {
				System.out.println(e.getLocalizedMessage());
			} finally {
				System.out.println("Finally block");
			}

			try {
				String str = null;
				System.out.println("null pointer exception : " + str.length());
			} finally {
				System.out.println("äfter try finally block");
			}

			ExceptionHandlingTest test = new ExceptionHandlingTest();
			test.sum();
			test.customisedException();

//		try {
//
//			try {
//				try {
//
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//
//		} catch(Exception e) {
//			
//		}
		}
	}
}
