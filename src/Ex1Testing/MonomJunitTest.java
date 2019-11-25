package Ex1Testing;

import Ex1.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonomJunitTest {

	@Test
	void testDerivative() {
		String[] monoms = {"4x", "-x^2", "8x^3","-5x", "-9x^9"};
		String[] testMonoms = {"4x", "-2x", "24x^2","-5", "-81x^8"};
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			Monom temptest=new Monom(testMonoms[i]);
			Monom tempDer = new Monom (temp.derivative());
			tempDer.equals(temptest);
		}
	}

	@Test
	void testF() {
		String[] monoms = {"4x", "-x^2", "8x^3","-5x", "-9x^9"};
		double [] testMonoms = {20, -25, 1000,-25, -17578125};
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			double  ans = temp.f(5);
			if (ans !=  testMonoms[i]) {
				fail("this is not eqaul");
			}
		}
	}

	@Test
	void testIsZero() {
		Monom mul=new Monom("0");
			mul.isZero();
			Monom temp=new Monom("x^2");
			temp.multipy(mul);
			temp.isZero();
	}

	@Test
	void testMonomString() {
		String[] monoms = {"4x", "-x", "8","-5x^7", "-9x^6"};
		String[] monoms2 = {"4.0x", "-1.0x", "8.0","-5.0x^7", "-9.0x^6"};
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			Monom temptest=new Monom(monoms2[i]);
			temp.equals(temptest);
		}
	}

	@Test
	void testAdd() {
		String[] monoms = {"4x", "-x", "8x","-5x", "-9x"};
		String[] testMonoms = {"13x", "8x", "17x","4x", "0"};
		Monom mul=new Monom("9x");
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			Monom temptest=new Monom(testMonoms[i]);
			temp.add(mul);
			temp.equals(temptest);
		}
	}

	@Test
	void testEqualsMonom() {
		String[] monoms = {"4x", "-x", "8x","-5x", "-9x"};
		String[] testMonoms = {"13x", "8x", "17x","4x", "0"};
		Monom mul=new Monom("9x");
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			Monom temptest=new Monom(testMonoms[i]);
			temp.add(mul);
			temp.equals(temptest);
		}
	}

	@Test
	void testInitFromString() {
		fail("Not yet implemented");
	}

	@Test
	void testCopy() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMultipy() {
		String[] monoms = { "0", "4x", "-x", "8","12x^2", "9x^7"};
		String[] testMonoms = { "0", "36.0x^2", "-9.0x^2", "72.0x","108.0x^3", "81.0x^8"};
		Monom mul=new Monom("9x");
		for(int i=0;i<monoms.length;i++) {
			Monom temp=new Monom(monoms[i]);
			Monom temptest=new Monom(testMonoms[i]);
			temp.multipy(mul);
			temp.equals(temptest);
	}

}
}