package org.Test.Git.Eclipse;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJunitEclipse {
	static Calcule C= null;

	@Before
	public void initial() {
		 C= new Calcule(5,6);
	}
	
	@Test
	public void test() {
		//Calcule C= new Calcule(5,6);
		assertEquals(11,C.Somme());
	}

}
