package com.talking.clock;

import com.talking.clock.exception.InvalidHoursException;
import com.talking.clock.exception.InvalidMinException;
import com.talking.clock.util.TimeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TimeUtilBusinessTest {

	@Test
	public void testOneClock(){
		String humanReadable = TimeUtil.timeString(1, 00);
		Assertions.assertEquals("One o'clock",humanReadable);
	}

	@Test
	public void testTwoClock(){
		String humanReadable = TimeUtil.timeString(2, 00);
		Assertions.assertEquals("Two o'clock",humanReadable);
	}

	@Test
	public void testOneClock13(){
		String humanReadable = TimeUtil.timeString(13, 00);
		Assertions.assertEquals("One o'clock",humanReadable);
	}

	@Test
	public void testFivePastOne(){
		String humanReadable = TimeUtil.timeString(13, 05);
		Assertions.assertEquals("Five past One",humanReadable);
	}
	@Test
	public void testTenPastOne(){
		String humanReadable = TimeUtil.timeString(13, 10);
		Assertions.assertEquals("Ten past One",humanReadable);
	}

	@Test
	public void testTwentyFivePastOne(){
		String humanReadable = TimeUtil.timeString(13, 25);
		Assertions.assertEquals("Twenty five past One",humanReadable);
	}
	@Test
	public void testHalfPastOne(){
		String humanReadable = TimeUtil.timeString(13, 30);
		Assertions.assertEquals("Half past One",humanReadable);
	}

	@Test
	public void testTwentyFiveToTwo(){
		String humanReadable = TimeUtil.timeString(13, 35);
		Assertions.assertEquals("Twenty five to Two",humanReadable);
	}
	@Test
	public void testFiveToTwo(){
		String humanReadable = TimeUtil.timeString(13, 55);
		Assertions.assertEquals("Five to Two",humanReadable);
	}

	@Test
	public void testInvalidHourException(){
		Exception exception = Assertions.assertThrows(InvalidHoursException.class,()->TimeUtil.timeString(25, 55));
		Assertions.assertEquals("Invalid Hours Entered!!",exception.getMessage());
	}

	@Test
	public void testInvalidMinuteException(){
		Exception exception = Assertions.assertThrows(InvalidMinException.class,()->TimeUtil.timeString(13, 66));
		Assertions.assertEquals("Invalid Minutes  Entered!!",exception.getMessage());
	}

}
