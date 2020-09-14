import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Jun {
	//assertEquals
	@Test
	void addition() {
			System.out.println("Adding test");
			Junit junit = new Junit();
			assertEquals(2, junit.add(1, 1));
		
	}
	@Test
	void additionButFails() {
		System.out.println("Adding failed test");
		Junit junit = new Junit();
		assertEquals(4, junit.add(2, 2));
		
	}
	@Test
	public void whenAssertingArraysEquality_thenEqual() {
	    char[] expected = {'J','u','n','i','t'};
	    char[] actual = "Junit".toCharArray();
	    
	    assertArrayEquals(expected, actual);
	    System.out.println("Testing an array with arrayequals");
	}
	@Test
	public void whenAssertingConditions_thenVerified() {
	    assertTrue("5 is greater then 4", 5 > 4);
	    assertFalse("5 is not greater then 6", 5 > 6);
	    System.out.println("testing assert/true/false");
	}
	void testCase() 
	{    
	    String originalObject = "howtodoinjava.com";
	    String cloneObject = originalObject;
	    String otherObject = "example.com";
	     
	    //Test will pass
	    Assertions.assertNotSame(originalObject, otherObject);
	     
	    //Test will fail
	    Assertions.assertNotSame(originalObject, cloneObject);
	     
	    //Test will pass
	    Assertions.assertSame(originalObject, cloneObject);
	 
	    // Test will fail
	    Assertions.assertSame(originalObject, otherObject);
	    
	}
	
	
	 @Test
	    public void shouldRecognizeNull() {
	        assertEquals(false, Jun.isPalindrome(null));
	    }

	    @Test
	    public void shouldRecognizeEmptyString() {
	        assertEquals(true, Jun.isPalindrome(""));
	    }

	    @Test
	    public void shouldRecognizeOneCharacterPalindrome() {
	        assertEquals(true, Jun.isPalindrome("a"));
	    }

	    @Test
	    public void shouldRecognizeTwoCharacterPalindrome() {
	        assertEquals(true, Jun.isPalindrome("aa"));
	    }

	    @Test
	    public void shouldRecognizeTwoCharacterNonPalindrome() {
	        assertEquals(false, Jun.isPalindrome("ab"));
	    }

	    @Test
	    public void shouldRecognizePalindrome() {
	        assertEquals(true, Jun.isPalindrome("amanaplanacanalpanama"));
	    }

	    @Test
	    public void shouldRecognizeNonPalindrome() {
	        assertEquals(false, Jun.isPalindrome("noPalindrome"));
	    }
	    @Test
	    public void shouldRecognizPalindrome() {
	        assertEquals(true, Jun.isPalindrome("anna"));System.out.println("Testing Palindromes with strings");
	    }

	    public static boolean isPalindrome(String word) {
	    	
	        if (word == null) {
	            // assuming a null value is no palindrome
	            return false;
	        } else if (word.length() < 2) {
	            // assuming both "" and "x" are palindromes
	            return true;
	        } else {
	            // a word is a palindrome if it starts and ends in the same letter..
	            if (!word.endsWith(word.substring(0, 1))) {
	                return false;
	            }
	            // .. and everything in between the first and the last letter is a palindrome
	            return isPalindrome(word.substring(1, word.length() - 1));
	        }
	    }
	
}
