@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean expected = true;
    boolean isAdult = program.checkIsAdult(19);
	// Напиши код здесь
    assertEquals("Пользователю меньше 18 лет", expected, isAdult);
}